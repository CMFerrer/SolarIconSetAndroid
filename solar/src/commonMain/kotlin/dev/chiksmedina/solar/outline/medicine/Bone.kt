package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(
            name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.1695f, 3.2681f)
                curveTo(16.4787f, 2.5773f, 15.3586f, 2.5773f, 14.6678f, 3.2681f)
                curveTo(14.1001f, 3.8358f, 13.8097f, 4.8572f, 14.0124f, 5.5897f)
                curveTo(14.1024f, 5.9151f, 14.1642f, 6.3049f, 14.1294f, 6.6988f)
                curveTo(14.0944f, 7.0963f, 13.9553f, 7.543f, 13.599f, 7.8992f)
                lineTo(7.8992f, 13.599f)
                curveTo(7.543f, 13.9553f, 7.0963f, 14.0944f, 6.6988f, 14.1294f)
                curveTo(6.3049f, 14.1642f, 5.9151f, 14.1024f, 5.5897f, 14.0124f)
                curveTo(4.8572f, 13.8097f, 3.8358f, 14.1001f, 3.2681f, 14.6678f)
                curveTo(2.5773f, 15.3586f, 2.5773f, 16.4787f, 3.2681f, 17.1695f)
                curveTo(3.959f, 17.8603f, 5.079f, 17.8603f, 5.7698f, 17.1695f)
                curveTo(6.0627f, 16.8766f, 6.5376f, 16.8766f, 6.8305f, 17.1695f)
                curveTo(7.1234f, 17.4624f, 7.1234f, 17.9373f, 6.8305f, 18.2302f)
                curveTo(6.1397f, 18.921f, 6.1397f, 20.041f, 6.8305f, 20.7319f)
                curveTo(7.5213f, 21.4227f, 8.6414f, 21.4227f, 9.3322f, 20.7319f)
                curveTo(9.8999f, 20.1642f, 10.1903f, 19.1428f, 9.9876f, 18.4103f)
                curveTo(9.8976f, 18.085f, 9.8358f, 17.6951f, 9.8706f, 17.3012f)
                curveTo(9.9056f, 16.9038f, 10.0447f, 16.457f, 10.401f, 16.1008f)
                lineTo(16.1008f, 10.401f)
                curveTo(16.457f, 10.0447f, 16.9037f, 9.9056f, 17.3012f, 9.8706f)
                curveTo(17.6951f, 9.8358f, 18.0849f, 9.8976f, 18.4103f, 9.9876f)
                curveTo(19.1428f, 10.1903f, 20.1642f, 9.8999f, 20.7319f, 9.3322f)
                curveTo(21.4227f, 8.6414f, 21.4227f, 7.5213f, 20.7319f, 6.8305f)
                curveTo(20.041f, 6.1397f, 18.921f, 6.1397f, 18.2302f, 6.8305f)
                curveTo(17.9373f, 7.1234f, 17.4624f, 7.1234f, 17.1695f, 6.8305f)
                curveTo(16.8766f, 6.5376f, 16.8766f, 6.0627f, 17.1695f, 5.7698f)
                curveTo(17.8603f, 5.079f, 17.8603f, 3.959f, 17.1695f, 3.2681f)
                close()
                moveTo(19.1732f, 4.8268f)
                curveTo(19.2612f, 3.8908f, 18.9468f, 2.9242f, 18.2302f, 2.2075f)
                curveTo(16.9535f, 0.9308f, 14.8837f, 0.9308f, 13.6071f, 2.2075f)
                curveTo(12.6884f, 3.1262f, 12.2086f, 4.6957f, 12.5667f, 5.9897f)
                curveTo(12.6251f, 6.2007f, 12.6496f, 6.4037f, 12.6352f, 6.567f)
                curveTo(12.6212f, 6.7266f, 12.5756f, 6.8014f, 12.5384f, 6.8386f)
                lineTo(6.8386f, 12.5384f)
                curveTo(6.8014f, 12.5756f, 6.7266f, 12.6212f, 6.567f, 12.6352f)
                curveTo(6.4037f, 12.6496f, 6.2007f, 12.6251f, 5.9897f, 12.5667f)
                curveTo(4.6957f, 12.2086f, 3.1262f, 12.6884f, 2.2075f, 13.6071f)
                curveTo(0.9308f, 14.8837f, 0.9308f, 16.9535f, 2.2075f, 18.2302f)
                curveTo(2.9242f, 18.9468f, 3.8908f, 19.2612f, 4.8268f, 19.1732f)
                curveTo(4.7388f, 20.1092f, 5.0532f, 21.0758f, 5.7698f, 21.7925f)
                curveTo(7.0465f, 23.0692f, 9.1163f, 23.0692f, 10.3929f, 21.7925f)
                curveTo(11.3116f, 20.8738f, 11.7914f, 19.3043f, 11.4333f, 18.0103f)
                curveTo(11.3749f, 17.7993f, 11.3504f, 17.5963f, 11.3648f, 17.433f)
                curveTo(11.3788f, 17.2734f, 11.4244f, 17.1986f, 11.4616f, 17.1614f)
                lineTo(17.1614f, 11.4616f)
                curveTo(17.1986f, 11.4244f, 17.2734f, 11.3788f, 17.433f, 11.3648f)
                curveTo(17.5963f, 11.3504f, 17.7993f, 11.3749f, 18.0103f, 11.4333f)
                curveTo(19.3043f, 11.7914f, 20.8738f, 11.3116f, 21.7925f, 10.3929f)
                curveTo(23.0692f, 9.1163f, 23.0692f, 7.0465f, 21.7925f, 5.7698f)
                curveTo(21.0758f, 5.0532f, 20.1092f, 4.7388f, 19.1732f, 4.8268f)
                close()
            }
        }
            .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
