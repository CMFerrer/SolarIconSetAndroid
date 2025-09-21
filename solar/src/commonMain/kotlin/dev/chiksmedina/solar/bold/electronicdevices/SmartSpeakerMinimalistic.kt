package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.SmartSpeakerMinimalistic: ImageVector
    get() {
        if (_smartSpeakerMinimalistic != null) {
            return _smartSpeakerMinimalistic!!
        }
        _smartSpeakerMinimalistic = Builder(
            name = "SmartSpeakerMinimalistic", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.2394f, 2.4614f)
                curveTo(5.1512f, 2.8518f, 3.5622f, 4.5537f, 3.321f, 6.6582f)
                lineTo(3.3053f, 6.7952f)
                curveTo(2.8982f, 10.3467f, 2.8982f, 13.9329f, 3.3053f, 17.4844f)
                curveTo(3.5527f, 19.6422f, 5.2487f, 21.3512f, 7.4102f, 21.6206f)
                lineTo(8.4257f, 21.7471f)
                curveTo(8.9205f, 21.8088f, 9.1679f, 21.8396f, 9.415f, 21.8654f)
                curveTo(11.1335f, 22.0449f, 12.866f, 22.0449f, 14.5845f, 21.8654f)
                curveTo(14.8316f, 21.8396f, 15.079f, 21.8088f, 15.5738f, 21.7471f)
                lineTo(16.48f, 21.6342f)
                curveTo(18.7041f, 21.357f, 20.4473f, 19.5951f, 20.6948f, 17.3739f)
                lineTo(20.712f, 17.2199f)
                curveTo(21.1072f, 13.6729f, 21.0957f, 10.0925f, 20.6774f, 6.5481f)
                curveTo(20.4367f, 4.5076f, 18.8934f, 2.8602f, 16.8681f, 2.4816f)
                lineTo(16.5451f, 2.4212f)
                curveTo(13.541f, 1.8596f, 10.4585f, 1.8596f, 7.4544f, 2.4212f)
                lineTo(7.2394f, 2.4614f)
                close()
                moveTo(6.425f, 5.5184f)
                curveTo(6.691f, 5.2009f, 7.164f, 5.1591f, 7.4815f, 5.425f)
                curveTo(8.0587f, 5.9084f, 9.6762f, 6.75f, 12.0f, 6.75f)
                curveTo(14.3238f, 6.75f, 15.9413f, 5.9084f, 16.5185f, 5.425f)
                curveTo(16.836f, 5.1591f, 17.309f, 5.2009f, 17.575f, 5.5184f)
                curveTo(17.8409f, 5.836f, 17.7991f, 6.309f, 17.4815f, 6.575f)
                curveTo(16.6196f, 7.2969f, 14.6562f, 8.25f, 12.0f, 8.25f)
                curveTo(9.3438f, 8.25f, 7.3804f, 7.2969f, 6.5184f, 6.575f)
                curveTo(6.2009f, 6.309f, 6.1591f, 5.836f, 6.425f, 5.5184f)
                close()
            }
        }
            .build()
        return _smartSpeakerMinimalistic!!
    }

private var _smartSpeakerMinimalistic: ImageVector? = null
