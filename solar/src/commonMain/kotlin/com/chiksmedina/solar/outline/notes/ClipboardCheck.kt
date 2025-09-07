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

val NotesGroup.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) {
            return _clipboardCheck!!
        }
        _clipboardCheck = Builder(
            name = "ClipboardCheck", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
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
                moveTo(15.5483f, 10.4883f)
                curveTo(15.8309f, 10.7911f, 15.8146f, 11.2657f, 15.5117f, 11.5483f)
                lineTo(11.226f, 15.5483f)
                curveTo(10.9379f, 15.8172f, 10.4907f, 15.8172f, 10.2025f, 15.5483f)
                lineTo(8.4883f, 13.9483f)
                curveTo(8.1854f, 13.6657f, 8.1691f, 13.1911f, 8.4517f, 12.8883f)
                curveTo(8.7343f, 12.5854f, 9.2089f, 12.5691f, 9.5117f, 12.8517f)
                lineTo(10.7143f, 13.9741f)
                lineTo(14.4883f, 10.4517f)
                curveTo(14.7911f, 10.1691f, 15.2657f, 10.1854f, 15.5483f, 10.4883f)
                close()
            }
        }
            .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
