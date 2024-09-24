from collections import defaultdict

def find_users_with_error(logs):
    # Create a defaultdict to hold lists of actions for each user
    user_actions = defaultdict(list)

    # Iterate over each log entry
    for log in logs:
        # Append the action to the user's list of actions
        user_actions[log['user']].append(log['action'])

    # Return a list of users whose actions contain the sequence 'ABC'
    return [user for user, actions in user_actions.items() if 'ABC' in ''.join(actions)]

# Example usage:
logs = [
    {'user': 1, 'action': 'A'},
    {'user': 1, 'action': 'B'},
    {'user': 2, 'action': 'A'},
    {'user': 1, 'action': 'C'},
    {'user': 2, 'action': 'B'},
    {'user': 3, 'action': 'Z'},
    {'user': 2, 'action': 'B'},
    {'user': 2, 'action': 'C'},
    {'user': 3, 'action': 'A'},
    {'user': 3, 'action': 'B'},
    {'user': 3, 'action': 'C'}
]

# Call the function with the example logs and print the result
result = find_users_with_error(logs)
print(result)
