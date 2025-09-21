package dev.chiksmedina.solar.broken.videoaudiosound

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
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

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
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 13.4375f)
                curveTo(22.0f, 17.2087f, 22.0f, 19.0944f, 20.8284f, 20.2659f)
                curveTo(19.6569f, 21.4375f, 17.7712f, 21.4375f, 14.0f, 21.4375f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.4375f, 4.3432f, 21.4375f, 3.1716f, 20.2659f)
                curveTo(2.0f, 19.0944f, 2.0f, 17.2087f, 2.0f, 13.4375f)
                curveTo(2.0f, 9.6663f, 2.0f, 7.7807f, 3.1716f, 6.6091f)
                curveTo(4.3432f, 5.4375f, 6.2288f, 5.4375f, 10.0f, 5.4375f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 5.4375f, 19.6569f, 5.4375f, 20.8284f, 6.6091f)
                curveTo(21.4921f, 7.2727f, 21.7798f, 8.1655f, 21.9045f, 9.5002f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.9878f, 6.0f)
                curveTo(4.1002f, 5.069f, 4.3349f, 4.4256f, 4.825f, 3.9373f)
                curveTo(5.7655f, 3.0f, 7.2793f, 3.0f, 10.3069f, 3.0f)
                horizontalLineTo(13.5181f)
                curveTo(16.5457f, 3.0f, 18.0595f, 3.0f, 19.0f, 3.9373f)
                curveTo(19.4901f, 4.4256f, 19.7248f, 5.069f, 19.8372f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.5f, 9.9375f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 13.9376f)
                lineTo(3.7516f, 12.405f)
                curveTo(4.6629f, 11.6077f, 6.0363f, 11.6534f, 6.8925f, 12.5096f)
                lineTo(11.1822f, 16.7993f)
                curveTo(11.8694f, 17.4866f, 12.9512f, 17.5803f, 13.7464f, 17.0214f)
                lineTo(14.0446f, 16.8119f)
                curveTo(15.1888f, 16.0077f, 16.7369f, 16.1009f, 17.7765f, 17.0365f)
                lineTo(21.0f, 19.9376f)
            }
        }
            .build()
        return _galleryWide!!
    }

private var _galleryWide: ImageVector? = null
