package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Muted: ImageVector
    get() {
        if (_muted != null) {
            return _muted!!
        }
        _muted = Builder(name = "Muted", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.4697f, 8.4697f)
                curveTo(13.7626f, 8.1768f, 14.2374f, 8.1768f, 14.5303f, 8.4697f)
                lineTo(17.0f, 10.9394f)
                lineTo(19.4697f, 8.4697f)
                curveTo(19.7626f, 8.1768f, 20.2374f, 8.1768f, 20.5303f, 8.4697f)
                curveTo(20.8232f, 8.7626f, 20.8232f, 9.2375f, 20.5303f, 9.5303f)
                lineTo(18.0607f, 12.0f)
                lineTo(20.5303f, 14.4696f)
                curveTo(20.8232f, 14.7625f, 20.8232f, 15.2374f, 20.5303f, 15.5303f)
                curveTo(20.2374f, 15.8232f, 19.7625f, 15.8232f, 19.4696f, 15.5303f)
                lineTo(17.0f, 13.0607f)
                lineTo(14.5304f, 15.5303f)
                curveTo(14.2375f, 15.8232f, 13.7626f, 15.8232f, 13.4697f, 15.5303f)
                curveTo(13.1768f, 15.2374f, 13.1768f, 14.7626f, 13.4697f, 14.4697f)
                lineTo(15.9394f, 12.0f)
                lineTo(13.4697f, 9.5303f)
                curveTo(13.1768f, 9.2374f, 13.1768f, 8.7626f, 13.4697f, 8.4697f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.681f, 8.1636f)
                curveTo(3.0599f, 8.9522f, 3.0409f, 9.8733f, 3.003f, 11.7155f)
                curveTo(3.001f, 11.8122f, 3.0f, 11.9072f, 3.0f, 12.0f)
                curveTo(3.0f, 12.0928f, 3.001f, 12.1878f, 3.003f, 12.2845f)
                curveTo(3.0409f, 14.1267f, 3.0599f, 15.0478f, 3.681f, 15.8364f)
                curveTo(3.7944f, 15.9803f, 3.9607f, 16.1513f, 4.1001f, 16.2673f)
                curveTo(4.8639f, 16.9026f, 5.8724f, 16.9026f, 7.8893f, 16.9026f)
                curveTo(8.6099f, 16.9026f, 8.9702f, 16.9026f, 9.3137f, 16.9955f)
                curveTo(9.385f, 17.0148f, 9.4557f, 17.037f, 9.5253f, 17.0622f)
                curveTo(9.8608f, 17.1833f, 10.1616f, 17.3916f, 10.7632f, 17.8084f)
                curveTo(13.137f, 19.4526f, 14.3239f, 20.2747f, 15.3201f, 19.9176f)
                curveTo(15.5111f, 19.8491f, 15.6959f, 19.7503f, 15.861f, 19.6284f)
                curveTo(16.647f, 19.0481f, 16.7702f, 17.7654f, 16.8852f, 15.2969f)
                lineTo(15.591f, 16.591f)
                curveTo(14.7123f, 17.4697f, 13.2877f, 17.4697f, 12.409f, 16.591f)
                curveTo(11.5304f, 15.7123f, 11.5304f, 14.2877f, 12.409f, 13.409f)
                lineTo(13.818f, 12.0f)
                lineTo(12.409f, 10.591f)
                curveTo(11.5303f, 9.7123f, 11.5303f, 8.2877f, 12.409f, 7.409f)
                curveTo(13.2877f, 6.5303f, 14.7123f, 6.5303f, 15.591f, 7.409f)
                lineTo(16.8852f, 8.7032f)
                curveTo(16.7702f, 6.2346f, 16.647f, 4.9519f, 15.861f, 4.3716f)
                curveTo(15.6959f, 4.2497f, 15.5111f, 4.1509f, 15.3201f, 4.0824f)
                curveTo(14.3239f, 3.7253f, 13.137f, 4.5474f, 10.7632f, 6.1916f)
                curveTo(10.1616f, 6.6084f, 9.8608f, 6.8168f, 9.5253f, 6.9378f)
                curveTo(9.4557f, 6.963f, 9.385f, 6.9852f, 9.3137f, 7.0045f)
                curveTo(8.9702f, 7.0974f, 8.6099f, 7.0974f, 7.8893f, 7.0974f)
                curveTo(5.8724f, 7.0974f, 4.8639f, 7.0974f, 4.1001f, 7.7327f)
                curveTo(3.9607f, 7.8487f, 3.7944f, 8.0197f, 3.681f, 8.1636f)
                close()
            }
        }
        .build()
        return _muted!!
    }

private var _muted: ImageVector? = null
