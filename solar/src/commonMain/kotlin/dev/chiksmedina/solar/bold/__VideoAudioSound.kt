package dev.chiksmedina.solar.bold

import androidx.compose.ui.graphics.vector.ImageVector
import dev.chiksmedina.solar.BoldSolar
import dev.chiksmedina.solar.bold.videoaudiosound.Album
import dev.chiksmedina.solar.bold.videoaudiosound.Camera
import dev.chiksmedina.solar.bold.videoaudiosound.CameraAdd
import dev.chiksmedina.solar.bold.videoaudiosound.CameraMinimalistic
import dev.chiksmedina.solar.bold.videoaudiosound.CameraRotate
import dev.chiksmedina.solar.bold.videoaudiosound.CameraSquare
import dev.chiksmedina.solar.bold.videoaudiosound.Clapperboard
import dev.chiksmedina.solar.bold.videoaudiosound.ClapperboardEdit
import dev.chiksmedina.solar.bold.videoaudiosound.ClapperboardOpen
import dev.chiksmedina.solar.bold.videoaudiosound.ClapperboardOpenPlay
import dev.chiksmedina.solar.bold.videoaudiosound.ClapperboardPlay
import dev.chiksmedina.solar.bold.videoaudiosound.ClapperboardText
import dev.chiksmedina.solar.bold.videoaudiosound.FullScreen
import dev.chiksmedina.solar.bold.videoaudiosound.FullScreenCircle
import dev.chiksmedina.solar.bold.videoaudiosound.FullScreenSquare
import dev.chiksmedina.solar.bold.videoaudiosound.Gallery
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryAdd
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryCheck
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryCircle
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryDownload
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryEdit
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryFavourite
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryMinimalistic
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryRemove
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryRound
import dev.chiksmedina.solar.bold.videoaudiosound.GallerySend
import dev.chiksmedina.solar.bold.videoaudiosound.GalleryWide
import dev.chiksmedina.solar.bold.videoaudiosound.Library
import dev.chiksmedina.solar.bold.videoaudiosound.Microphone
import dev.chiksmedina.solar.bold.videoaudiosound.Microphone2
import dev.chiksmedina.solar.bold.videoaudiosound.Microphone3
import dev.chiksmedina.solar.bold.videoaudiosound.MicrophoneLarge
import dev.chiksmedina.solar.bold.videoaudiosound.MusicLibrary
import dev.chiksmedina.solar.bold.videoaudiosound.MusicLibrary2
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNote
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNote2
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNote3
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNote4
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNoteSlider
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNoteSlider2
import dev.chiksmedina.solar.bold.videoaudiosound.MusicNotes
import dev.chiksmedina.solar.bold.videoaudiosound.Muted
import dev.chiksmedina.solar.bold.videoaudiosound.Panorama
import dev.chiksmedina.solar.bold.videoaudiosound.Pause
import dev.chiksmedina.solar.bold.videoaudiosound.PauseCircle
import dev.chiksmedina.solar.bold.videoaudiosound.Pip
import dev.chiksmedina.solar.bold.videoaudiosound.Pip2
import dev.chiksmedina.solar.bold.videoaudiosound.Play
import dev.chiksmedina.solar.bold.videoaudiosound.PlayCircle
import dev.chiksmedina.solar.bold.videoaudiosound.PlayStream
import dev.chiksmedina.solar.bold.videoaudiosound.PlaybackSpeed
import dev.chiksmedina.solar.bold.videoaudiosound.Podcast
import dev.chiksmedina.solar.bold.videoaudiosound.QuitFullScreen
import dev.chiksmedina.solar.bold.videoaudiosound.QuitFullScreenCircle
import dev.chiksmedina.solar.bold.videoaudiosound.QuitFullScreenSquare
import dev.chiksmedina.solar.bold.videoaudiosound.QuitPip
import dev.chiksmedina.solar.bold.videoaudiosound.Record
import dev.chiksmedina.solar.bold.videoaudiosound.RecordCircle
import dev.chiksmedina.solar.bold.videoaudiosound.Reel
import dev.chiksmedina.solar.bold.videoaudiosound.Reel2
import dev.chiksmedina.solar.bold.videoaudiosound.Repeat
import dev.chiksmedina.solar.bold.videoaudiosound.RepeatOne
import dev.chiksmedina.solar.bold.videoaudiosound.RepeatOneMinimalistic
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind10SecondsBack
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind10SecondsForward
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind15SecondsBack
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind15SecondsForward
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind5SecondsBack
import dev.chiksmedina.solar.bold.videoaudiosound.Rewind5SecondsForward
import dev.chiksmedina.solar.bold.videoaudiosound.RewindBack
import dev.chiksmedina.solar.bold.videoaudiosound.RewindBackCircle
import dev.chiksmedina.solar.bold.videoaudiosound.RewindForward
import dev.chiksmedina.solar.bold.videoaudiosound.RewindForwardCircle
import dev.chiksmedina.solar.bold.videoaudiosound.Shuffle
import dev.chiksmedina.solar.bold.videoaudiosound.SkipNext
import dev.chiksmedina.solar.bold.videoaudiosound.SkipPrevious
import dev.chiksmedina.solar.bold.videoaudiosound.Soundwave
import dev.chiksmedina.solar.bold.videoaudiosound.SoundwaveCircle
import dev.chiksmedina.solar.bold.videoaudiosound.SoundwaveSquare
import dev.chiksmedina.solar.bold.videoaudiosound.Stop
import dev.chiksmedina.solar.bold.videoaudiosound.StopCircle
import dev.chiksmedina.solar.bold.videoaudiosound.Stream
import dev.chiksmedina.solar.bold.videoaudiosound.ToPip
import dev.chiksmedina.solar.bold.videoaudiosound.UploadTrack
import dev.chiksmedina.solar.bold.videoaudiosound.UploadTrack2
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFrame
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFrame2
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFrameCut
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFrameCut2
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFramePlayHorizontal
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFramePlayVertical
import dev.chiksmedina.solar.bold.videoaudiosound.VideoFrameReplace
import dev.chiksmedina.solar.bold.videoaudiosound.VideoLibrary
import dev.chiksmedina.solar.bold.videoaudiosound.Videocamera
import dev.chiksmedina.solar.bold.videoaudiosound.VideocameraAdd
import dev.chiksmedina.solar.bold.videoaudiosound.VideocameraRecord
import dev.chiksmedina.solar.bold.videoaudiosound.Vinyl
import dev.chiksmedina.solar.bold.videoaudiosound.VinylRecord
import dev.chiksmedina.solar.bold.videoaudiosound.Volume
import dev.chiksmedina.solar.bold.videoaudiosound.VolumeCross
import dev.chiksmedina.solar.bold.videoaudiosound.VolumeLoud
import dev.chiksmedina.solar.bold.videoaudiosound.VolumeSmall
import dev.chiksmedina.solar.bold.videoaudiosound.Wallpaper
import kotlin.collections.List as KtList

object VideoAudioSoundGroup

val BoldSolar.VideoAudioSound: VideoAudioSoundGroup
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
