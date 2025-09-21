package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.GalleryCircle: ImageVector
    get() {
        if (_galleryCircle != null) {
            return _galleryCircle!!
        }
        _galleryCircle = Builder(
            name = "GalleryCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 10.1046f, 16.1046f, 11.0f, 15.0f, 11.0f)
                curveTo(13.8954f, 11.0f, 13.0f, 10.1046f, 13.0f, 9.0f)
                curveTo(13.0f, 7.8954f, 13.8954f, 7.0f, 15.0f, 7.0f)
                curveTo(16.1046f, 7.0f, 17.0f, 7.8954f, 17.0f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 1.25f)
                curveTo(6.0629f, 1.25f, 1.25f, 6.0629f, 1.25f, 12.0f)
                curveTo(1.25f, 17.9371f, 6.0629f, 22.75f, 12.0f, 22.75f)
                curveTo(17.9371f, 22.75f, 22.75f, 17.9371f, 22.75f, 12.0f)
                curveTo(22.75f, 6.0629f, 17.9371f, 1.25f, 12.0f, 1.25f)
                close()
                moveTo(11.1822f, 15.3618f)
                lineTo(6.8925f, 11.0721f)
                curveTo(6.0363f, 10.2159f, 4.6629f, 10.1702f, 3.7516f, 10.9675f)
                lineTo(2.751f, 11.8623f)
                curveTo(2.8246f, 6.8171f, 6.9373f, 2.75f, 12.0f, 2.75f)
                curveTo(17.1086f, 2.75f, 21.25f, 6.8914f, 21.25f, 12.0f)
                curveTo(21.25f, 13.9546f, 20.6438f, 15.7676f, 19.609f, 17.2612f)
                lineTo(17.7765f, 15.599f)
                curveTo(16.7369f, 14.6634f, 15.1888f, 14.5702f, 14.0446f, 15.3744f)
                lineTo(13.7464f, 15.5839f)
                curveTo(12.9512f, 16.1428f, 11.8694f, 16.0491f, 11.1822f, 15.3618f)
                close()
            }
        }
            .build()
        return _galleryCircle!!
    }

private var _galleryCircle: ImageVector? = null
