package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.BillList: ImageVector
    get() {
        if (_billList != null) {
            return _billList!!
        }
        _billList = Builder(name = "BillList", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.245f, 2.0f)
                horizontalLineTo(16.755f)
                curveTo(17.9139f, 2.0f, 18.4933f, 2.0f, 18.9606f, 2.1626f)
                curveTo(19.8468f, 2.471f, 20.5425f, 3.1872f, 20.842f, 4.0995f)
                curveTo(21.0f, 4.5806f, 21.0f, 5.1771f, 21.0f, 6.3701f)
                verticalLineTo(20.3742f)
                curveTo(21.0f, 21.2324f, 20.015f, 21.6878f, 19.3919f, 21.1176f)
                curveTo(19.0258f, 20.7826f, 18.4742f, 20.7826f, 18.1081f, 21.1176f)
                lineTo(17.625f, 21.5597f)
                curveTo(16.9834f, 22.1468f, 16.0166f, 22.1468f, 15.375f, 21.5597f)
                curveTo(14.7334f, 20.9726f, 13.7666f, 20.9726f, 13.125f, 21.5597f)
                curveTo(12.4834f, 22.1468f, 11.5166f, 22.1468f, 10.875f, 21.5597f)
                curveTo(10.2334f, 20.9726f, 9.2666f, 20.9726f, 8.625f, 21.5597f)
                curveTo(7.9834f, 22.1468f, 7.0166f, 22.1468f, 6.375f, 21.5597f)
                lineTo(5.8919f, 21.1176f)
                curveTo(5.5258f, 20.7826f, 4.9742f, 20.7826f, 4.6081f, 21.1176f)
                curveTo(3.985f, 21.6878f, 3.0f, 21.2324f, 3.0f, 20.3742f)
                verticalLineTo(6.3701f)
                curveTo(3.0f, 5.1771f, 3.0f, 4.5806f, 3.1579f, 4.0995f)
                curveTo(3.4575f, 3.1872f, 4.1532f, 2.471f, 5.0394f, 2.1626f)
                curveTo(5.5067f, 2.0f, 6.0861f, 2.0f, 7.245f, 2.0f)
                close()
                moveTo(7.0f, 6.75f)
                curveTo(6.5858f, 6.75f, 6.25f, 7.0858f, 6.25f, 7.5f)
                curveTo(6.25f, 7.9142f, 6.5858f, 8.25f, 7.0f, 8.25f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 8.25f, 8.25f, 7.9142f, 8.25f, 7.5f)
                curveTo(8.25f, 7.0858f, 7.9142f, 6.75f, 7.5f, 6.75f)
                horizontalLineTo(7.0f)
                close()
                moveTo(10.5f, 6.75f)
                curveTo(10.0858f, 6.75f, 9.75f, 7.0858f, 9.75f, 7.5f)
                curveTo(9.75f, 7.9142f, 10.0858f, 8.25f, 10.5f, 8.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 8.25f, 17.75f, 7.9142f, 17.75f, 7.5f)
                curveTo(17.75f, 7.0858f, 17.4142f, 6.75f, 17.0f, 6.75f)
                horizontalLineTo(10.5f)
                close()
                moveTo(7.0f, 10.25f)
                curveTo(6.5858f, 10.25f, 6.25f, 10.5858f, 6.25f, 11.0f)
                curveTo(6.25f, 11.4142f, 6.5858f, 11.75f, 7.0f, 11.75f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 11.75f, 8.25f, 11.4142f, 8.25f, 11.0f)
                curveTo(8.25f, 10.5858f, 7.9142f, 10.25f, 7.5f, 10.25f)
                horizontalLineTo(7.0f)
                close()
                moveTo(10.5f, 10.25f)
                curveTo(10.0858f, 10.25f, 9.75f, 10.5858f, 9.75f, 11.0f)
                curveTo(9.75f, 11.4142f, 10.0858f, 11.75f, 10.5f, 11.75f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 11.75f, 17.75f, 11.4142f, 17.75f, 11.0f)
                curveTo(17.75f, 10.5858f, 17.4142f, 10.25f, 17.0f, 10.25f)
                horizontalLineTo(10.5f)
                close()
                moveTo(7.0f, 13.75f)
                curveTo(6.5858f, 13.75f, 6.25f, 14.0858f, 6.25f, 14.5f)
                curveTo(6.25f, 14.9142f, 6.5858f, 15.25f, 7.0f, 15.25f)
                horizontalLineTo(7.5f)
                curveTo(7.9142f, 15.25f, 8.25f, 14.9142f, 8.25f, 14.5f)
                curveTo(8.25f, 14.0858f, 7.9142f, 13.75f, 7.5f, 13.75f)
                horizontalLineTo(7.0f)
                close()
                moveTo(10.5f, 13.75f)
                curveTo(10.0858f, 13.75f, 9.75f, 14.0858f, 9.75f, 14.5f)
                curveTo(9.75f, 14.9142f, 10.0858f, 15.25f, 10.5f, 15.25f)
                horizontalLineTo(17.0f)
                curveTo(17.4142f, 15.25f, 17.75f, 14.9142f, 17.75f, 14.5f)
                curveTo(17.75f, 14.0858f, 17.4142f, 13.75f, 17.0f, 13.75f)
                horizontalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _billList!!
    }

private var _billList: ImageVector? = null
