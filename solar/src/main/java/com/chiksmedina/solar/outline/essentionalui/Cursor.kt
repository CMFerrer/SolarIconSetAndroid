package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.3171f, 4.6258f)
                lineTo(15.8843f, 6.6769f)
                curveTo(16.6539f, 6.9604f, 17.3099f, 7.2021f, 17.7856f, 7.4621f)
                curveTo(18.284f, 7.7345f, 18.7564f, 8.1178f, 18.8983f, 8.764f)
                curveTo(19.0402f, 9.4102f, 18.7719f, 9.9562f, 18.4336f, 10.4123f)
                curveTo(18.1107f, 10.8477f, 17.6163f, 11.3421f, 17.0363f, 11.922f)
                lineTo(16.3223f, 12.636f)
                lineTo(19.7465f, 16.0603f)
                curveTo(19.9365f, 16.2503f, 20.1049f, 16.4187f, 20.2356f, 16.5685f)
                curveTo(20.3745f, 16.7277f, 20.5074f, 16.9061f, 20.5987f, 17.1264f)
                curveTo(20.8004f, 17.6135f, 20.8004f, 18.1607f, 20.5987f, 18.6478f)
                curveTo(20.5074f, 18.8681f, 20.3745f, 19.0465f, 20.2356f, 19.2057f)
                curveTo(20.1049f, 19.3555f, 19.9365f, 19.5239f, 19.7465f, 19.7139f)
                lineTo(19.7139f, 19.7465f)
                curveTo(19.524f, 19.9365f, 19.3556f, 20.1049f, 19.2057f, 20.2356f)
                curveTo(19.0465f, 20.3745f, 18.8681f, 20.5074f, 18.6478f, 20.5987f)
                curveTo(18.1608f, 20.8004f, 17.6135f, 20.8004f, 17.1265f, 20.5987f)
                curveTo(16.9061f, 20.5074f, 16.7278f, 20.3745f, 16.5686f, 20.2356f)
                curveTo(16.4187f, 20.1049f, 16.2503f, 19.9364f, 16.0603f, 19.7465f)
                lineTo(12.6361f, 16.3222f)
                lineTo(11.922f, 17.0363f)
                curveTo(11.3421f, 17.6162f, 10.8478f, 18.1106f, 10.4124f, 18.4336f)
                curveTo(9.9562f, 18.7719f, 9.4102f, 19.0402f, 8.764f, 18.8983f)
                curveTo(8.1178f, 18.7563f, 7.7345f, 18.284f, 7.4621f, 17.7856f)
                curveTo(7.2021f, 17.3099f, 6.9604f, 16.6539f, 6.6769f, 15.8842f)
                lineTo(4.6259f, 10.3171f)
                curveTo(4.045f, 8.7405f, 3.5796f, 7.4773f, 3.3731f, 6.5043f)
                curveTo(3.1669f, 5.5327f, 3.1551f, 4.567f, 3.8611f, 3.861f)
                curveTo(4.5671f, 3.1551f, 5.5327f, 3.1669f, 6.5043f, 3.3731f)
                curveTo(7.4774f, 3.5796f, 8.7405f, 4.045f, 10.3171f, 4.6258f)
                close()
                moveTo(6.1929f, 4.8404f)
                curveTo(5.3249f, 4.6562f, 5.0557f, 4.7877f, 4.9217f, 4.9217f)
                curveTo(4.7878f, 5.0557f, 4.6562f, 5.3249f, 4.8404f, 6.1929f)
                curveTo(5.0216f, 7.0467f, 5.4472f, 8.2076f, 6.0565f, 9.8611f)
                lineTo(8.0641f, 15.3103f)
                curveTo(8.3737f, 16.1507f, 8.5781f, 16.6999f, 8.7783f, 17.0662f)
                curveTo(8.966f, 17.4096f, 9.0639f, 17.4289f, 9.084f, 17.4328f)
                curveTo(9.0847f, 17.433f, 9.0853f, 17.4331f, 9.0858f, 17.4332f)
                curveTo(9.0863f, 17.4333f, 9.0869f, 17.4335f, 9.0875f, 17.4336f)
                curveTo(9.1075f, 17.4385f, 9.2044f, 17.462f, 9.5188f, 17.2288f)
                curveTo(9.854f, 16.9802f, 10.2698f, 16.5671f, 10.9031f, 15.9339f)
                lineTo(12.1057f, 14.7312f)
                curveTo(12.3986f, 14.4383f, 12.8735f, 14.4383f, 13.1664f, 14.7312f)
                lineTo(17.1047f, 18.6695f)
                curveTo(17.3158f, 18.8807f, 17.4479f, 19.0122f, 17.5546f, 19.1052f)
                curveTo(17.6561f, 19.1938f, 17.6934f, 19.2099f, 17.7005f, 19.2128f)
                curveTo(17.82f, 19.2623f, 17.9543f, 19.2623f, 18.0738f, 19.2128f)
                curveTo(18.0809f, 19.2099f, 18.1182f, 19.1938f, 18.2197f, 19.1052f)
                curveTo(18.3263f, 19.0122f, 18.4584f, 18.8807f, 18.6696f, 18.6695f)
                curveTo(18.8807f, 18.4584f, 19.0122f, 18.3263f, 19.1052f, 18.2197f)
                curveTo(19.1938f, 18.1182f, 19.2099f, 18.0808f, 19.2129f, 18.0737f)
                curveTo(19.2624f, 17.9542f, 19.2624f, 17.82f, 19.2129f, 17.7005f)
                curveTo(19.2099f, 17.6934f, 19.1938f, 17.6561f, 19.1052f, 17.5545f)
                curveTo(19.0122f, 17.4479f, 18.8807f, 17.3158f, 18.6696f, 17.1047f)
                lineTo(14.7313f, 13.1664f)
                curveTo(14.4384f, 12.8735f, 14.4384f, 12.3986f, 14.7313f, 12.1057f)
                lineTo(15.9339f, 10.9031f)
                curveTo(16.5672f, 10.2698f, 16.9802f, 9.854f, 17.2288f, 9.5188f)
                curveTo(17.462f, 9.2044f, 17.4385f, 9.1074f, 17.4336f, 9.0875f)
                curveTo(17.4335f, 9.0868f, 17.4333f, 9.0863f, 17.4332f, 9.0858f)
                curveTo(17.4331f, 9.0853f, 17.433f, 9.0847f, 17.4329f, 9.084f)
                curveTo(17.4289f, 9.0639f, 17.4097f, 8.966f, 17.0662f, 8.7783f)
                curveTo(16.7f, 8.5781f, 16.1507f, 8.3736f, 15.3104f, 8.064f)
                lineTo(9.8612f, 6.0564f)
                curveTo(8.2076f, 5.4472f, 7.0468f, 5.0216f, 6.1929f, 4.8404f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
