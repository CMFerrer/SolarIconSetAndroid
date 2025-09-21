package dev.chiksmedina.solar.linear

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.LinearSolar
import dev.chiksmedina.solar.linear.videoaudiosound.Album
import dev.chiksmedina.solar.linear.videoaudiosound.Camera
import dev.chiksmedina.solar.linear.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.linear.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.linear.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.linear.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.linear.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.linear.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.linear.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.linear.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.linear.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.linear.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.linear.videoaudiosound.FullScreen
import dev.chiksmedina.solar.linear.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.linear.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.linear.videoaudiosound.Gallery
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.linear.videoaudiosound.GallerySend
import dev.chiksmedina.solar.linear.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.linear.videoaudiosound.Library
import dev.chiksmedina.solar.linear.videoaudiosound.Microphone
import dev.chiksmedina.solar.linear.videoaudiosound.Microphone2
import dev.chiksmedina.solar.linear.videoaudiosound.Microphone3
import dev.chiksmedina.solar.linear.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.linear.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.linear.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNote
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.linear.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.linear.videoaudiosound.Muted
import dev.chiksmedina.solar.linear.videoaudiosound.Panorama
import dev.chiksmedina.solar.linear.videoaudiosound.Pause
import dev.chiksmedina.solar.linear.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.linear.videoaudiosound.Pip
import dev.chiksmedina.solar.linear.videoaudiosound.Pip2
import dev.chiksmedina.solar.linear.videoaudiosound.Play
import dev.chiksmedina.solar.linear.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.linear.videoaudiosound.PlayStream
import dev.chiksmedina.solar.linear.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.linear.videoaudiosound.Podcast
import dev.chiksmedina.solar.linear.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.linear.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.linear.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.linear.videoaudiosound.QuitPip
import dev.chiksmedina.solar.linear.videoaudiosound.Record
import dev.chiksmedina.solar.linear.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.linear.videoaudiosound.Reel
import dev.chiksmedina.solar.linear.videoaudiosound.Reel2
import dev.chiksmedina.solar.linear.videoaudiosound.Repeat
import dev.chiksmedina.solar.linear.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.linear.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.linear.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.linear.videoaudiosound.RewindBack
import dev.chiksmedina.solar.linear.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.linear.videoaudiosound.RewindForward
import dev.chiksmedina.solar.linear.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.linear.videoaudiosound.Shuffle
import dev.chiksmedina.solar.linear.videoaudiosound.SkipNext
import dev.chiksmedina.solar.linear.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.linear.videoaudiosound.Soundwave
import dev.chiksmedina.solar.linear.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.linear.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.linear.videoaudiosound.Stop
import dev.chiksmedina.solar.linear.videoaudiosound.StopCircle
import dev.chiksmedina.solar.linear.videoaudiosound.Stream
import dev.chiksmedina.solar.linear.videoaudiosound.ToPip
import dev.chiksmedina.solar.linear.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.linear.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.linear.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.linear.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.linear.videoaudiosound.Videocamera
import dev.chiksmedina.solar.linear.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.linear.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.linear.videoaudiosound.Vinyl
import dev.chiksmedina.solar.linear.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.linear.videoaudiosound.Volume
import dev.chiksmedina.solar.linear.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.linear.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.linear.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.linear.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val LinearSolar.VideoAudioSound: VideoAudioSoundGroup
    get() = VideoAudioSoundGroup

private var _AllIcons: KtList<ImageVector>? = null

val VideoAudioSoundGroup.AllIcons: KtList<ImageVector>
    get() {
        if (_AllIcons != null) {
            return _AllIcons!!
        }
        _AllIcons = listOf(
            Album,
            Camera,
            CameraAdd,
            CameraMinimalistic,
            CameraRotate,
            CameraSquare,
            Clapperboard,
            ClapperboardEdit,
            ClapperboardOpen,
            ClapperboardOpenPlay,
            ClapperboardPlay,
            ClapperboardText,
            FullScreen,
            FullScreenCircle,
            FullScreenSquare,
            Gallery,
            GalleryAdd,
            GalleryCheck,
            GalleryCircle,
            GalleryDownload,
            GalleryEdit,
            GalleryFavourite,
            GalleryMinimalistic,
            GalleryRemove,
            GalleryRound,
            GallerySend,
            GalleryWide,
            Library,
            Microphone,
            Microphone2,
            Microphone3,
            MicrophoneLarge,
            MusicLibrary,
            MusicLibrary2,
            MusicNote,
            MusicNotes,
            MusicNote2,
            MusicNote3,
            MusicNote4,
            MusicNoteSlider,
            MusicNoteSlider2,
            Muted,
            Panorama,
            Pause,
            PauseCircle,
            Pip,
            Pip2,
            Play,
            PlaybackSpeed,
            PlayCircle,
            PlayStream,
            Podcast,
            QuitFullScreen,
            QuitFullScreenCircle,
            QuitFullScreenSquare,
            QuitPip,
            Record,
            RecordCircle,
            Reel,
            Reel2,
            Repeat,
            RepeatOne,
            RepeatOneMinimalistic,
            Rewind10SecondsBack,
            Rewind10SecondsForward,
            Rewind15SecondsBack,
            Rewind15SecondsForward,
            Rewind5SecondsBack,
            Rewind5SecondsForward,
            RewindBack,
            RewindBackCircle,
            RewindForward,
            RewindForwardCircle,
            Shuffle,
            SkipNext,
            SkipPrevious,
            Soundwave,
            SoundwaveCircle,
            SoundwaveSquare,
            Stop,
            StopCircle,
            Stream,
            ToPip,
            UploadTrack,
            UploadTrack2,
            Videocamera,
            VideocameraAdd,
            VideocameraRecord,
            VideoFrame,
            VideoFrame2,
            VideoFrameCut,
            VideoFrameCut2,
            VideoFramePlayHorizontal,
            VideoFramePlayVertical,
            VideoFrameReplace,
            VideoLibrary,
            Vinyl,
            VinylRecord,
            Volume,
            VolumeCross,
            VolumeLoud,
            VolumeSmall,
            Wallpaper
        )
        return _AllIcons!!
    }
