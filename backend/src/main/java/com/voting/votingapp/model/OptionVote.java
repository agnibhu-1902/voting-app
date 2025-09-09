package com.voting.votingapp.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class OptionVote {
    private String optionText;
    private long voteCount = 0L;

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public String toString() {
        return "OptionVote{" +
                "optionText='" + optionText + '\'' +
                ", voteCount=" + voteCount +
                '}';
    }
}
