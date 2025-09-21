package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Hanger: ImageVector
    get() {
        if (_hanger != null) {
            return _hanger!!
        }
        _hanger = Builder(
            name = "Hanger", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.7928f, 9.8799f)
                curveTo(12.6665f, 9.8698f, 13.5522f, 10.112f, 14.3038f, 10.6187f)
                lineTo(21.7363f, 15.629f)
                curveTo(22.6859f, 16.2692f, 22.9431f, 17.3256f, 22.6127f, 18.2165f)
                curveTo(22.2877f, 19.0928f, 21.4221f, 19.75f, 20.2975f, 19.75f)
                horizontalLineTo(3.7026f)
                curveTo(2.5899f, 19.75f, 1.728f, 19.1049f, 1.3959f, 18.2392f)
                curveTo(1.0583f, 17.3591f, 1.2968f, 16.3086f, 2.2238f, 15.6565f)
                lineTo(9.3195f, 10.6653f)
                curveTo(10.0541f, 10.1486f, 10.9263f, 9.89f, 11.7928f, 9.8799f)
                close()
                moveTo(13.4653f, 11.8624f)
                curveTo(12.9827f, 11.5371f, 12.3996f, 11.373f, 11.8102f, 11.3798f)
                curveTo(11.2258f, 11.3866f, 10.6528f, 11.5614f, 10.1825f, 11.8922f)
                lineTo(3.0868f, 16.8834f)
                curveTo(2.7417f, 17.1262f, 2.6962f, 17.4407f, 2.7964f, 17.7019f)
                curveTo(2.9021f, 17.9774f, 3.1999f, 18.25f, 3.7026f, 18.25f)
                horizontalLineTo(20.2975f)
                curveTo(20.8059f, 18.25f, 21.1032f, 17.9729f, 21.2063f, 17.6949f)
                curveTo(21.304f, 17.4314f, 21.2546f, 17.1133f, 20.8978f, 16.8728f)
                lineTo(13.4653f, 11.8624f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.2856f, 6.9091f)
                curveTo(10.2856f, 6.3422f, 10.8236f, 5.75f, 11.6596f, 5.75f)
                curveTo(12.4957f, 5.75f, 13.0336f, 6.3422f, 13.0336f, 6.9091f)
                curveTo(13.0336f, 7.2214f, 12.9223f, 7.4911f, 12.7401f, 7.6892f)
                curveTo(12.6272f, 7.8121f, 12.5028f, 7.9349f, 12.3609f, 8.0748f)
                lineTo(12.2797f, 8.1551f)
                curveTo(12.1111f, 8.3218f, 11.9231f, 8.5107f, 11.7513f, 8.7128f)
                curveTo(11.4859f, 9.0248f, 11.1983f, 9.4366f, 11.0929f, 9.9428f)
                curveTo(11.3247f, 9.9037f, 11.5588f, 9.8829f, 11.7925f, 9.8802f)
                curveTo(12.0918f, 9.8767f, 12.3925f, 9.9029f, 12.6888f, 9.9591f)
                curveTo(12.7395f, 9.8781f, 12.8066f, 9.7873f, 12.8939f, 9.6846f)
                curveTo(13.0201f, 9.5362f, 13.1675f, 9.3867f, 13.3346f, 9.2214f)
                lineTo(13.4085f, 9.1485f)
                curveTo(13.5495f, 9.0094f, 13.7044f, 8.8567f, 13.8444f, 8.7044f)
                curveTo(14.2865f, 8.2235f, 14.5336f, 7.5893f, 14.5336f, 6.9091f)
                curveTo(14.5336f, 5.3673f, 13.1697f, 4.25f, 11.6596f, 4.25f)
                curveTo(10.1496f, 4.25f, 8.7856f, 5.3673f, 8.7856f, 6.9091f)
                curveTo(8.7856f, 7.3233f, 9.1214f, 7.6591f, 9.5356f, 7.6591f)
                curveTo(9.9499f, 7.6591f, 10.2856f, 7.3233f, 10.2856f, 6.9091f)
                close()
            }
        }
            .build()
        return _hanger!!
    }

private var _hanger: ImageVector? = null
