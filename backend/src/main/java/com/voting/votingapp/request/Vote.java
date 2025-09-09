package com.voting.votingapp.request;

public class Vote {
    private long pollId;
    private int optionIndex;

    public long getPollId() {
        return pollId;
    }

    public void setPollId(long pollId) {
        this.pollId = pollId;
    }

    public int getOptionIndex() {
        return optionIndex;
    }

    public void setOptionIndex(int optionIndex) {
        this.optionIndex = optionIndex;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "pollId=" + pollId +
                ", optionIndex=" + optionIndex +
                '}';
    }
}
