package com.chiksmedina.solar.lineduotone.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.SmartSpeakerMinimalistic: ImageVector
    get() {
        if (_smartSpeakerMinimalistic != null) {
            return _smartSpeakerMinimalistic!!
        }
        _smartSpeakerMinimalistic = Builder(name = "SmartSpeakerMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.321f, 6.6582f)
                curveTo(3.5622f, 4.5537f, 5.1512f, 2.8518f, 7.2393f, 2.4614f)
                lineTo(7.4544f, 2.4212f)
                curveTo(10.4585f, 1.8596f, 13.541f, 1.8596f, 16.5451f, 2.4212f)
                lineTo(16.8681f, 2.4816f)
                curveTo(18.8934f, 2.8602f, 20.4367f, 4.5076f, 20.6774f, 6.5481f)
                curveTo(21.0957f, 10.0925f, 21.1072f, 13.6729f, 20.712f, 17.2199f)
                lineTo(20.6948f, 17.3739f)
                curveTo(20.4473f, 19.5951f, 18.7041f, 21.357f, 16.48f, 21.6342f)
                lineTo(15.5738f, 21.7471f)
                curveTo(15.079f, 21.8088f, 14.8316f, 21.8396f, 14.5845f, 21.8654f)
                curveTo(12.866f, 22.0449f, 11.1335f, 22.0449f, 9.415f, 21.8654f)
                curveTo(9.1679f, 21.8396f, 8.9205f, 21.8088f, 8.4257f, 21.7471f)
                lineTo(7.4102f, 21.6206f)
                curveTo(5.2487f, 21.3512f, 3.5527f, 19.6422f, 3.3053f, 17.4844f)
                curveTo(2.8982f, 13.9329f, 2.8982f, 10.3467f, 3.3053f, 6.7952f)
                lineTo(3.321f, 6.6582f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                curveTo(16.2804f, 6.6026f, 14.49f, 7.5f, 12.0f, 7.5f)
                curveTo(9.51f, 7.5f, 7.7196f, 6.6026f, 7.0f, 6.0f)
            }
        }
        .build()
        return _smartSpeakerMinimalistic!!
    }

private var _smartSpeakerMinimalistic: ImageVector? = null
