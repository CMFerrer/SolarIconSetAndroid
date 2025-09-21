package dev.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.VideoAudioSoundGroup

val VideoAudioSoundGroup.GalleryMinimalistic: ImageVector
    get() {
        if (_galleryMinimalistic != null) {
            return _galleryMinimalistic!!
        }
        _galleryMinimalistic = Builder(
            name = "GalleryMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(17.1046f, 10.0f, 18.0f, 9.1046f, 18.0f, 8.0f)
                curveTo(18.0f, 6.8954f, 17.1046f, 6.0f, 16.0f, 6.0f)
                curveTo(14.8954f, 6.0f, 14.0f, 6.8954f, 14.0f, 8.0f)
                curveTo(14.0f, 9.1046f, 14.8954f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.3209f, 13.1038f)
                curveTo(6.945f, 12.5241f, 7.9199f, 12.5566f, 8.504f, 13.1766f)
                lineTo(11.1515f, 15.9869f)
                curveTo(11.9509f, 16.8356f, 13.2596f, 16.9499f, 14.1941f, 16.2527f)
                curveTo(14.8073f, 15.7953f, 15.661f, 15.8473f, 16.2141f, 16.3757f)
                lineTo(18.4819f, 18.5423f)
                curveTo(18.7814f, 18.8284f, 19.2562f, 18.8176f, 19.5423f, 18.5181f)
                curveTo(19.8284f, 18.2186f, 19.8176f, 17.7438f, 19.5181f, 17.4577f)
                lineTo(17.2503f, 15.2911f)
                curveTo(16.1679f, 14.257f, 14.4971f, 14.1553f, 13.2972f, 15.0504f)
                curveTo(12.9735f, 15.2919f, 12.5202f, 15.2523f, 12.2433f, 14.9584f)
                lineTo(9.5958f, 12.1481f)
                curveTo(8.4465f, 10.9281f, 6.5282f, 10.8641f, 5.3001f, 12.0047f)
                lineTo(4.4896f, 12.7575f)
                curveTo(4.1861f, 13.0394f, 4.1686f, 13.5139f, 4.4505f, 13.8174f)
                curveTo(4.7324f, 14.1209f, 5.2069f, 14.1385f, 5.5104f, 13.8566f)
                lineTo(6.3209f, 13.1038f)
                close()
            }
        }
            .build()
        return _galleryMinimalistic!!
    }

private var _galleryMinimalistic: ImageVector? = null
