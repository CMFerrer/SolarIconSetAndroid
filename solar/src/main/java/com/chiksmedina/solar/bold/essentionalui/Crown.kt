package com.chiksmedina.solar.bold.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.EssentionalUiGroup

val EssentionalUiGroup.Crown: ImageVector
    get() {
        if (_crown != null) {
            return _crown!!
        }
        _crown = Builder(
            name = "Crown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.6872f, 14.0931f)
                lineTo(19.8706f, 12.3884f)
                curveTo(19.9684f, 11.4789f, 20.033f, 10.8783f, 19.9823f, 10.4999f)
                lineTo(20.0f, 10.5f)
                curveTo(20.8284f, 10.5f, 21.5f, 9.8284f, 21.5f, 9.0f)
                curveTo(21.5f, 8.1716f, 20.8284f, 7.5f, 20.0f, 7.5f)
                curveTo(19.1716f, 7.5f, 18.5f, 8.1716f, 18.5f, 9.0f)
                curveTo(18.5f, 9.3747f, 18.6374f, 9.7172f, 18.8645f, 9.9801f)
                curveTo(18.5384f, 10.1814f, 18.1122f, 10.606f, 17.4705f, 11.2451f)
                lineTo(17.4705f, 11.2451f)
                curveTo(16.9762f, 11.7375f, 16.729f, 11.9837f, 16.4533f, 12.0219f)
                curveTo(16.3005f, 12.043f, 16.1449f, 12.0213f, 16.0038f, 11.9592f)
                curveTo(15.7492f, 11.847f, 15.5794f, 11.5427f, 15.2399f, 10.934f)
                lineTo(13.4505f, 7.7254f)
                curveTo(13.241f, 7.3499f, 13.0657f, 7.0356f, 12.9077f, 6.7826f)
                curveTo(13.556f, 6.4519f, 14.0f, 5.7778f, 14.0f, 5.0f)
                curveTo(14.0f, 3.8954f, 13.1046f, 3.0f, 12.0f, 3.0f)
                curveTo(10.8954f, 3.0f, 10.0f, 3.8954f, 10.0f, 5.0f)
                curveTo(10.0f, 5.7778f, 10.444f, 6.4519f, 11.0923f, 6.7826f)
                curveTo(10.9343f, 7.0356f, 10.759f, 7.3498f, 10.5495f, 7.7254f)
                lineTo(8.7601f, 10.934f)
                curveTo(8.4206f, 11.5427f, 8.2508f, 11.847f, 7.9962f, 11.9592f)
                curveTo(7.8551f, 12.0213f, 7.6995f, 12.043f, 7.5467f, 12.0219f)
                curveTo(7.271f, 11.9837f, 7.0238f, 11.7375f, 6.5295f, 11.2451f)
                curveTo(5.8879f, 10.606f, 5.4616f, 10.1814f, 5.1355f, 9.9801f)
                curveTo(5.3626f, 9.7172f, 5.5f, 9.3747f, 5.5f, 9.0f)
                curveTo(5.5f, 8.1716f, 4.8284f, 7.5f, 4.0f, 7.5f)
                curveTo(3.1716f, 7.5f, 2.5f, 8.1716f, 2.5f, 9.0f)
                curveTo(2.5f, 9.8284f, 3.1716f, 10.5f, 4.0f, 10.5f)
                lineTo(4.0177f, 10.4999f)
                curveTo(3.967f, 10.8783f, 4.0316f, 11.4789f, 4.1294f, 12.3884f)
                lineTo(4.3128f, 14.0931f)
                curveTo(4.4146f, 15.0393f, 4.4992f, 15.9396f, 4.6029f, 16.75f)
                horizontalLineTo(19.3971f)
                curveTo(19.5008f, 15.9396f, 19.5854f, 15.0393f, 19.6872f, 14.0931f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.9121f, 21.0f)
                horizontalLineTo(13.0879f)
                curveTo(15.9239f, 21.0f, 17.3418f, 21.0f, 18.2879f, 20.1532f)
                curveTo(18.7009f, 19.7835f, 18.9623f, 19.1172f, 19.151f, 18.25f)
                horizontalLineTo(4.849f)
                curveTo(5.0377f, 19.1172f, 5.2991f, 19.7835f, 5.7121f, 20.1532f)
                curveTo(6.6582f, 21.0f, 8.0761f, 21.0f, 10.9121f, 21.0f)
                close()
            }
        }
            .build()
        return _crown!!
    }

private var _crown: ImageVector? = null
