package com.chiksmedina.solar.linear.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.VideoAudioSoundGroup

val VideoAudioSoundGroup.GalleryWide: ImageVector
    get() {
        if (_galleryWide != null) {
            return _galleryWide!!
        }
        _galleryWide = Builder(
            name = "GalleryWide", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.0f)
                curveTo(2.0f, 10.2288f, 2.0f, 8.3432f, 3.1716f, 7.1716f)
                curveTo(4.3432f, 6.0f, 6.2288f, 6.0f, 10.0f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 6.0f, 19.6569f, 6.0f, 20.8284f, 7.1716f)
                curveTo(22.0f, 8.3432f, 22.0f, 10.2288f, 22.0f, 14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 7.0f)
                lineTo(3.9878f, 6.0f)
                curveTo(4.1002f, 5.069f, 4.3349f, 4.4256f, 4.825f, 3.9373f)
                curveTo(5.7655f, 3.0f, 7.2793f, 3.0f, 10.3069f, 3.0f)
                horizontalLineTo(13.5181f)
                curveTo(16.5457f, 3.0f, 18.0595f, 3.0f, 19.0f, 3.9373f)
                curveTo(19.4901f, 4.4256f, 19.7248f, 5.069f, 19.8372f, 6.0f)
                verticalLineTo(7.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 10.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 14.5001f)
                lineTo(3.7516f, 12.9675f)
                curveTo(4.6629f, 12.1702f, 6.0363f, 12.2159f, 6.8925f, 13.0721f)
                lineTo(11.1822f, 17.3618f)
                curveTo(11.8694f, 18.0491f, 12.9512f, 18.1428f, 13.7464f, 17.5839f)
                lineTo(14.0446f, 17.3744f)
                curveTo(15.1888f, 16.5702f, 16.7369f, 16.6634f, 17.7765f, 17.599f)
                lineTo(21.0f, 20.5001f)
            }
        }
            .build()
        return _galleryWide!!
    }

private var _galleryWide: ImageVector? = null
