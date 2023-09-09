package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

public val NotesGroup.ClipboardRemove: ImageVector
    get() {
        if (_clipboardRemove != null) {
            return _clipboardRemove!!
        }
        _clipboardRemove = Builder(name = "ClipboardRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.2628f, 3.2587f)
                curveTo(7.3832f, 2.1295f, 8.3389f, 1.25f, 9.5f, 1.25f)
                horizontalLineTo(14.5f)
                curveTo(15.6611f, 1.25f, 16.6168f, 2.1295f, 16.7372f, 3.2587f)
                curveTo(17.5004f, 3.2743f, 18.1602f, 3.3137f, 18.7236f, 3.4172f)
                curveTo(19.4816f, 3.5564f, 20.1267f, 3.8217f, 20.6517f, 4.3466f)
                curveTo(21.2536f, 4.9485f, 21.5125f, 5.7064f, 21.6335f, 6.6065f)
                curveTo(21.75f, 7.4735f, 21.75f, 8.5758f, 21.75f, 9.9434f)
                verticalLineTo(16.0531f)
                curveTo(21.75f, 17.4207f, 21.75f, 18.523f, 21.6335f, 19.39f)
                curveTo(21.5125f, 20.2901f, 21.2536f, 21.048f, 20.6517f, 21.6499f)
                curveTo(20.0497f, 22.2518f, 19.2919f, 22.5107f, 18.3918f, 22.6317f)
                curveTo(17.5248f, 22.7483f, 16.4225f, 22.7483f, 15.0549f, 22.7483f)
                horizontalLineTo(8.9451f)
                curveTo(7.5775f, 22.7483f, 6.4752f, 22.7483f, 5.6083f, 22.6317f)
                curveTo(4.7081f, 22.5107f, 3.9503f, 22.2518f, 3.3484f, 21.6499f)
                curveTo(2.7464f, 21.048f, 2.4875f, 20.2901f, 2.3665f, 19.39f)
                curveTo(2.25f, 18.523f, 2.25f, 17.4207f, 2.25f, 16.0531f)
                verticalLineTo(9.9434f)
                curveTo(2.25f, 8.5758f, 2.25f, 7.4735f, 2.3665f, 6.6065f)
                curveTo(2.4875f, 5.7064f, 2.7464f, 4.9485f, 3.3484f, 4.3466f)
                curveTo(3.8733f, 3.8217f, 4.5184f, 3.5564f, 5.2764f, 3.4172f)
                curveTo(5.8398f, 3.3137f, 6.4996f, 3.2743f, 7.2628f, 3.2587f)
                close()
                moveTo(7.2648f, 4.7591f)
                curveTo(6.5467f, 4.7745f, 5.9933f, 4.8106f, 5.5473f, 4.8925f)
                curveTo(4.9805f, 4.9966f, 4.6525f, 5.1638f, 4.409f, 5.4073f)
                curveTo(4.1322f, 5.684f, 3.9518f, 6.0726f, 3.8531f, 6.8064f)
                curveTo(3.7516f, 7.5617f, 3.75f, 8.5628f, 3.75f, 9.9983f)
                verticalLineTo(15.9983f)
                curveTo(3.75f, 17.4337f, 3.7516f, 18.4348f, 3.8531f, 19.1901f)
                curveTo(3.9518f, 19.9239f, 4.1322f, 20.3125f, 4.409f, 20.5893f)
                curveTo(4.6858f, 20.866f, 5.0743f, 21.0465f, 5.8081f, 21.1451f)
                curveTo(6.5635f, 21.2467f, 7.5646f, 21.2483f, 9.0f, 21.2483f)
                horizontalLineTo(15.0f)
                curveTo(16.4354f, 21.2483f, 17.4365f, 21.2467f, 18.1919f, 21.1451f)
                curveTo(18.9257f, 21.0465f, 19.3142f, 20.866f, 19.591f, 20.5893f)
                curveTo(19.8678f, 20.3125f, 20.0482f, 19.9239f, 20.1469f, 19.1901f)
                curveTo(20.2484f, 18.4348f, 20.25f, 17.4337f, 20.25f, 15.9983f)
                verticalLineTo(9.9983f)
                curveTo(20.25f, 8.5628f, 20.2484f, 7.5617f, 20.1469f, 6.8064f)
                curveTo(20.0482f, 6.0726f, 19.8678f, 5.684f, 19.591f, 5.4073f)
                curveTo(19.3475f, 5.1638f, 19.0195f, 4.9966f, 18.4527f, 4.8925f)
                curveTo(18.0067f, 4.8106f, 17.4533f, 4.7745f, 16.7352f, 4.7591f)
                curveTo(16.6067f, 5.8797f, 15.655f, 6.75f, 14.5f, 6.75f)
                horizontalLineTo(9.5f)
                curveTo(8.345f, 6.75f, 7.3933f, 5.8797f, 7.2648f, 4.7591f)
                close()
                moveTo(9.5f, 2.75f)
                curveTo(9.0858f, 2.75f, 8.75f, 3.0858f, 8.75f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(8.75f, 4.9142f, 9.0858f, 5.25f, 9.5f, 5.25f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 5.25f, 15.25f, 4.9142f, 15.25f, 4.5f)
                verticalLineTo(3.5f)
                curveTo(15.25f, 3.0858f, 14.9142f, 2.75f, 14.5f, 2.75f)
                horizontalLineTo(9.5f)
                close()
                moveTo(8.9697f, 11.5303f)
                curveTo(8.6768f, 11.2375f, 8.6768f, 10.7626f, 8.9697f, 10.4697f)
                curveTo(9.2626f, 10.1768f, 9.7374f, 10.1768f, 10.0303f, 10.4697f)
                lineTo(12.0f, 12.4394f)
                lineTo(13.9697f, 10.4697f)
                curveTo(14.2626f, 10.1768f, 14.7374f, 10.1768f, 15.0303f, 10.4697f)
                curveTo(15.3232f, 10.7626f, 15.3232f, 11.2375f, 15.0303f, 11.5304f)
                lineTo(13.0607f, 13.5f)
                lineTo(15.0303f, 15.4697f)
                curveTo(15.3232f, 15.7626f, 15.3232f, 16.2374f, 15.0303f, 16.5303f)
                curveTo(14.7374f, 16.8232f, 14.2625f, 16.8232f, 13.9697f, 16.5303f)
                lineTo(12.0f, 14.5607f)
                lineTo(10.0304f, 16.5303f)
                curveTo(9.7375f, 16.8232f, 9.2626f, 16.8232f, 8.9697f, 16.5304f)
                curveTo(8.6768f, 16.2375f, 8.6768f, 15.7626f, 8.9697f, 15.4697f)
                lineTo(10.9394f, 13.5f)
                lineTo(8.9697f, 11.5303f)
                close()
            }
        }
        .build()
        return _clipboardRemove!!
    }

private var _clipboardRemove: ImageVector? = null
