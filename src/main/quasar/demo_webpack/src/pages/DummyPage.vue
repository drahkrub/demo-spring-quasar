<template>
  <div>{{ tab }}</div>
</template>

<script setup>
defineProps({
  tab: {
    type: String,
    required: true,
  },
});
</script>
