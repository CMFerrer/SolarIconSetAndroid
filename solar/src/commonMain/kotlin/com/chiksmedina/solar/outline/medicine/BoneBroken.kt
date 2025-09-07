package com.chiksmedina.solar.outline.medicine

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
import com.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.BoneBroken: ImageVector
    get() {
        if (_boneBroken != null) {
            return _boneBroken!!
        }
        _boneBroken = Builder(
            name = "BoneBroken", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.1732f, 4.8268f)
                curveTo(19.2612f, 3.8908f, 18.9468f, 2.9242f, 18.2302f, 2.2075f)
                curveTo(16.9535f, 0.9308f, 14.8837f, 0.9308f, 13.6071f, 2.2075f)
                curveTo(12.6884f, 3.1262f, 12.2086f, 4.6957f, 12.5667f, 5.9897f)
                curveTo(12.6251f, 6.2007f, 12.6496f, 6.4037f, 12.6352f, 6.567f)
                curveTo(12.6212f, 6.7266f, 12.5756f, 6.8014f, 12.5384f, 6.8386f)
                lineTo(11.2589f, 8.118f)
                curveTo(10.814f, 8.5629f, 10.9592f, 9.3164f, 11.5374f, 9.5643f)
                curveTo(12.8398f, 10.1224f, 13.8776f, 11.1602f, 14.4357f, 12.4626f)
                curveTo(14.6836f, 13.0408f, 15.4371f, 13.186f, 15.882f, 12.7411f)
                lineTo(17.1614f, 11.4616f)
                curveTo(17.1986f, 11.4244f, 17.2734f, 11.3788f, 17.433f, 11.3648f)
                curveTo(17.5963f, 11.3504f, 17.7993f, 11.3749f, 18.0103f, 11.4333f)
                curveTo(19.3043f, 11.7914f, 20.8738f, 11.3116f, 21.7925f, 10.3929f)
                curveTo(23.0692f, 9.1163f, 23.0692f, 7.0465f, 21.7925f, 5.7698f)
                curveTo(21.0758f, 5.0532f, 20.1092f, 4.7388f, 19.1732f, 4.8268f)
                close()
                moveTo(17.1695f, 3.2681f)
                curveTo(16.4787f, 2.5773f, 15.3586f, 2.5773f, 14.6678f, 3.2681f)
                curveTo(14.1001f, 3.8358f, 13.8097f, 4.8572f, 14.0124f, 5.5897f)
                curveTo(14.1024f, 5.9151f, 14.1642f, 6.3049f, 14.1294f, 6.6988f)
                curveTo(14.0944f, 7.0963f, 13.9553f, 7.543f, 13.599f, 7.8992f)
                lineTo(12.9153f, 8.583f)
                curveTo(13.949f, 9.1895f, 14.8105f, 10.051f, 15.417f, 11.0847f)
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.1269f, 17.1264f)
                curveTo(17.4198f, 16.8335f, 17.8947f, 16.8335f, 18.1876f, 17.1264f)
                lineTo(19.6018f, 18.5406f)
                curveTo(19.8947f, 18.8335f, 19.8947f, 19.3084f, 19.6018f, 19.6013f)
                curveTo(19.3089f, 19.8942f, 18.834f, 19.8942f, 18.5411f, 19.6013f)
                lineTo(17.1269f, 18.1871f)
                curveTo(16.834f, 17.8942f, 16.834f, 17.4193f, 17.1269f, 17.1264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.8736f, 5.8129f)
                curveTo(7.1665f, 6.1058f, 7.1665f, 6.5807f, 6.8736f, 6.8736f)
                curveTo(6.5807f, 7.1665f, 6.1058f, 7.1665f, 5.8129f, 6.8736f)
                lineTo(4.3987f, 5.4594f)
                curveTo(4.1058f, 5.1665f, 4.1058f, 4.6916f, 4.3987f, 4.3987f)
                curveTo(4.6916f, 4.1058f, 5.1665f, 4.1058f, 5.4594f, 4.3987f)
                lineTo(6.8736f, 5.8129f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 18.25f)
                curveTo(15.4142f, 18.25f, 15.75f, 18.5858f, 15.75f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(15.75f, 20.4142f, 15.4142f, 20.75f, 15.0f, 20.75f)
                curveTo(14.5858f, 20.75f, 14.25f, 20.4142f, 14.25f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(14.25f, 18.5858f, 14.5858f, 18.25f, 15.0f, 18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 9.75f)
                curveTo(5.4142f, 9.75f, 5.75f, 9.4142f, 5.75f, 9.0f)
                curveTo(5.75f, 8.5858f, 5.4142f, 8.25f, 5.0f, 8.25f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 8.25f, 3.25f, 8.5858f, 3.25f, 9.0f)
                curveTo(3.25f, 9.4142f, 3.5858f, 9.75f, 4.0f, 9.75f)
                horizontalLineTo(5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.25f, 15.0f)
                curveTo(18.25f, 14.5858f, 18.5858f, 14.25f, 19.0f, 14.25f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 14.25f, 20.75f, 14.5858f, 20.75f, 15.0f)
                curveTo(20.75f, 15.4142f, 20.4142f, 15.75f, 20.0f, 15.75f)
                horizontalLineTo(19.0f)
                curveTo(18.5858f, 15.75f, 18.25f, 15.4142f, 18.25f, 15.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.25f, 5.0f)
                curveTo(8.25f, 5.4142f, 8.5858f, 5.75f, 9.0f, 5.75f)
                curveTo(9.4142f, 5.75f, 9.75f, 5.4142f, 9.75f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(9.75f, 3.5858f, 9.4142f, 3.25f, 9.0f, 3.25f)
                curveTo(8.5858f, 3.25f, 8.25f, 3.5858f, 8.25f, 4.0f)
                lineTo(8.25f, 5.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4626f, 14.4357f)
                curveTo(11.1602f, 13.8776f, 10.1224f, 12.8398f, 9.5643f, 11.5374f)
                curveTo(9.3164f, 10.9592f, 8.5629f, 10.814f, 8.118f, 11.2589f)
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
                lineTo(12.7411f, 15.882f)
                curveTo(13.186f, 15.4371f, 13.0408f, 14.6836f, 12.4626f, 14.4357f)
                close()
                moveTo(8.583f, 12.9153f)
                lineTo(7.9029f, 13.5954f)
                lineTo(7.8992f, 13.599f)
                lineTo(7.8765f, 13.6214f)
                curveTo(7.5241f, 13.9612f, 7.0878f, 14.0951f, 6.6988f, 14.1294f)
                curveTo(6.3049f, 14.1642f, 5.9151f, 14.1024f, 5.5897f, 14.0124f)
                curveTo(4.8572f, 13.8097f, 3.8358f, 14.1001f, 3.2681f, 14.6678f)
                curveTo(2.5773f, 15.3586f, 2.5773f, 16.4787f, 3.2681f, 17.1695f)
                curveTo(3.959f, 17.8603f, 5.079f, 17.8603f, 5.7698f, 17.1695f)
                curveTo(5.8431f, 17.0963f, 5.9277f, 17.0413f, 6.018f, 17.0047f)
                lineTo(6.024f, 17.0023f)
                curveTo(6.2936f, 16.8957f, 6.6125f, 16.9515f, 6.8305f, 17.1695f)
                curveTo(7.1234f, 17.4624f, 7.1234f, 17.9373f, 6.8305f, 18.2302f)
                curveTo(6.1397f, 18.921f, 6.1397f, 20.041f, 6.8305f, 20.7319f)
                curveTo(7.5213f, 21.4227f, 8.6414f, 21.4227f, 9.3322f, 20.7319f)
                curveTo(9.8999f, 20.1642f, 10.1903f, 19.1428f, 9.9876f, 18.4103f)
                curveTo(9.8976f, 18.085f, 9.8358f, 17.6951f, 9.8706f, 17.3012f)
                curveTo(9.9056f, 16.9037f, 10.0447f, 16.457f, 10.401f, 16.1008f)
                lineTo(11.0847f, 15.417f)
                curveTo(10.051f, 14.8105f, 9.1895f, 13.949f, 8.583f, 12.9153f)
                close()
            }
        }
            .build()
        return _boneBroken!!
    }

private var _boneBroken: ImageVector? = null
