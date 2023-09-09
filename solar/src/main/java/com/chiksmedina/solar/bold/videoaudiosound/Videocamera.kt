package com.chiksmedina.solar.bold.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.VideoAudioSoundGroup

public val VideoAudioSoundGroup.Videocamera: ImageVector
    get() {
        if (_videocamera != null) {
            return _videocamera!!
        }
        _videocamera = Builder(name = "Videocamera", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(2.0f, 15.7875f, 2.0f, 17.4312f, 2.908f, 18.5376f)
                curveTo(3.0742f, 18.7401f, 3.2599f, 18.9258f, 3.4624f, 19.092f)
                curveTo(4.5688f, 20.0f, 6.2125f, 20.0f, 9.5f, 20.0f)
                curveTo(12.7875f, 20.0f, 14.4312f, 20.0f, 15.5376f, 19.092f)
                curveTo(15.7401f, 18.9258f, 15.9258f, 18.7401f, 16.092f, 18.5376f)
                curveTo(16.7936f, 17.6827f, 16.9531f, 16.507f, 16.9893f, 14.5f)
                lineTo(17.6584f, 14.8292f)
                curveTo(19.6042f, 15.8021f, 20.5772f, 16.2886f, 21.2886f, 15.8489f)
                curveTo(22.0f, 15.4093f, 22.0f, 14.3215f, 22.0f, 12.1459f)
                verticalLineTo(11.8541f)
                curveTo(22.0f, 9.6785f, 22.0f, 8.5907f, 21.2886f, 8.1511f)
                curveTo(20.5772f, 7.7114f, 19.6042f, 8.1979f, 17.6584f, 9.1708f)
                lineTo(16.9893f, 9.5f)
                curveTo(16.9531f, 7.493f, 16.7936f, 6.3173f, 16.092f, 5.4624f)
                curveTo(15.9258f, 5.2599f, 15.7401f, 5.0742f, 15.5376f, 4.908f)
                curveTo(14.4312f, 4.0f, 12.7875f, 4.0f, 9.5f, 4.0f)
                curveTo(6.2125f, 4.0f, 4.5688f, 4.0f, 3.4624f, 4.908f)
                curveTo(3.2599f, 5.0742f, 3.0742f, 5.2599f, 2.908f, 5.4624f)
                curveTo(2.0f, 6.5688f, 2.0f, 8.2125f, 2.0f, 11.5f)
                close()
            }
        }
        .build()
        return _videocamera!!
    }

private var _videocamera: ImageVector? = null
