package com.chiksmedina.solar.lineduotone.electronicdevices

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
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartSpeaker: ImageVector
    get() {
        if (_smartSpeaker != null) {
            return _smartSpeaker!!
        }
        _smartSpeaker = Builder(
            name = "SmartSpeaker", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.5072f, 14.6151f)
                curveTo(3.3844f, 15.3798f, 5.8253f, 17.25f, 12.0f, 17.25f)
                verticalLineTo(15.75f)
                curveTo(6.193f, 15.75f, 4.1009f, 14.0144f, 3.4928f, 13.4844f)
                lineTo(2.5072f, 14.6151f)
                close()
                moveTo(12.0f, 17.25f)
                curveTo(15.1504f, 17.25f, 17.325f, 16.7702f, 18.823f, 16.1837f)
                curveTo(20.3317f, 15.5931f, 21.1221f, 14.9064f, 21.5075f, 14.5522f)
                lineTo(20.4925f, 13.4478f)
                curveTo(20.195f, 13.7212f, 19.5596f, 14.2845f, 18.2762f, 14.787f)
                curveTo(16.9821f, 15.2936f, 14.9981f, 15.75f, 12.0f, 15.75f)
                verticalLineTo(17.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 16.0f)
                curveTo(14.9178f, 14.2522f, 13.8467f, 13.5f, 12.0f, 13.5f)
                curveTo(10.1533f, 13.5f, 9.0822f, 14.2522f, 8.5f, 16.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 4.4115f)
                curveTo(7.6797f, 4.6869f, 7.5f, 5.0847f, 7.5f, 5.4115f)
                curveTo(7.5f, 6.5649f, 9.2386f, 7.4115f, 12.0f, 7.4115f)
                curveTo(14.7614f, 7.4115f, 16.5f, 6.5649f, 16.5f, 5.4115f)
                curveTo(16.5f, 5.0847f, 16.3203f, 4.7754f, 16.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
        }
            .build()
        return _smartSpeaker!!
    }

private var _smartSpeaker: ImageVector? = null
