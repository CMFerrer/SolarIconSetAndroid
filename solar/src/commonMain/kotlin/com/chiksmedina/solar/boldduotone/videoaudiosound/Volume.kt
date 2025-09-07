package com.chiksmedina.solar.boldduotone.videoaudiosound

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
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Volume: ImageVector
    get() {
        if (_volume != null) {
            return _volume!!
        }
        _volume = Builder(
            name = "Volume", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.7633f, 6.1916f)
                curveTo(12.1616f, 6.6084f, 11.8608f, 6.8167f, 11.5254f, 6.9378f)
                verticalLineTo(17.0622f)
                curveTo(11.8608f, 17.1833f, 12.1616f, 17.3916f, 12.7633f, 17.8084f)
                curveTo(15.137f, 19.4526f, 16.3239f, 20.2747f, 17.3201f, 19.9176f)
                curveTo(17.5111f, 19.8491f, 17.696f, 19.7503f, 17.8611f, 19.6284f)
                curveTo(18.7223f, 18.9926f, 18.7877f, 17.5132f, 18.9186f, 14.5546f)
                curveTo(18.967f, 13.4591f, 19.0f, 12.5215f, 19.0f, 12.0f)
                curveTo(19.0f, 11.4785f, 18.967f, 10.5409f, 18.9186f, 9.4454f)
                curveTo(18.7877f, 6.4868f, 18.7223f, 5.0074f, 17.8611f, 4.3716f)
                curveTo(17.696f, 4.2497f, 17.5111f, 4.1509f, 17.3201f, 4.0824f)
                curveTo(16.3239f, 3.7253f, 15.137f, 4.5474f, 12.7633f, 6.1916f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.681f, 8.1633f)
                curveTo(5.0599f, 8.9518f, 5.0409f, 9.8729f, 5.003f, 11.7152f)
                curveTo(5.001f, 11.8119f, 5.0f, 11.9069f, 5.0f, 11.9997f)
                curveTo(5.0f, 12.0925f, 5.001f, 12.1875f, 5.003f, 12.2842f)
                curveTo(5.0409f, 14.1264f, 5.0599f, 15.0475f, 5.681f, 15.8361f)
                curveTo(5.7944f, 15.98f, 5.9607f, 16.151f, 6.1001f, 16.267f)
                curveTo(6.8639f, 16.9023f, 7.8724f, 16.9023f, 9.8893f, 16.9023f)
                curveTo(10.6099f, 16.9023f, 10.9702f, 16.9023f, 11.3137f, 16.9952f)
                curveTo(11.385f, 17.0145f, 11.4556f, 17.0367f, 11.5253f, 17.0619f)
                verticalLineTo(6.9375f)
                curveTo(11.4556f, 6.9627f, 11.385f, 6.9849f, 11.3137f, 7.0042f)
                curveTo(10.9702f, 7.0971f, 10.6099f, 7.0971f, 9.8893f, 7.0971f)
                curveTo(7.8724f, 7.0971f, 6.8639f, 7.0971f, 6.1001f, 7.7324f)
                curveTo(5.9607f, 7.8484f, 5.7944f, 8.0194f, 5.681f, 8.1633f)
                close()
            }
        }
            .build()
        return _volume!!
    }

private var _volume: ImageVector? = null
