package com.chiksmedina.solar.broken.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.MoneyGroup

public val MoneyGroup.TicketSale: ImageVector
    get() {
        if (_ticketSale != null) {
            return _ticketSale!!
        }
        _ticketSale = Builder(name = "TicketSale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                lineTo(15.0f, 9.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 14.5f)
                curveTo(15.5f, 15.0523f, 15.0523f, 15.5f, 14.5f, 15.5f)
                curveTo(13.9477f, 15.5f, 13.5f, 15.0523f, 13.5f, 14.5f)
                curveTo(13.5f, 13.9477f, 13.9477f, 13.5f, 14.5f, 13.5f)
                curveTo(15.0523f, 13.5f, 15.5f, 13.9477f, 15.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 9.5f)
                curveTo(10.5f, 10.0523f, 10.0523f, 10.5f, 9.5f, 10.5f)
                curveTo(8.9477f, 10.5f, 8.5f, 10.0523f, 8.5f, 9.5f)
                curveTo(8.5f, 8.9477f, 8.9477f, 8.5f, 9.5f, 8.5f)
                curveTo(10.0523f, 8.5f, 10.5f, 8.9477f, 10.5f, 9.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0037f, 4.0f)
                horizontalLineTo(9.9963f)
                curveTo(6.2181f, 4.0f, 4.329f, 4.0f, 3.1553f, 5.1716f)
                curveTo(2.2766f, 6.0486f, 2.0557f, 7.3257f, 2.0002f, 9.4944f)
                curveTo(1.993f, 9.7725f, 2.2212f, 9.9947f, 2.4908f, 10.0652f)
                curveTo(3.3507f, 10.2901f, 3.9852f, 11.0711f, 3.9852f, 12.0f)
                curveTo(3.9852f, 12.9289f, 3.3507f, 13.7099f, 2.4908f, 13.9348f)
                curveTo(2.2212f, 14.0053f, 1.993f, 14.2275f, 2.0002f, 14.5056f)
                curveTo(2.0557f, 16.6743f, 2.2766f, 17.9514f, 3.1553f, 18.8284f)
                moveTo(18.0f, 4.1004f)
                curveTo(19.3086f, 4.2277f, 20.1885f, 4.5165f, 20.8448f, 5.1716f)
                curveTo(21.7234f, 6.0486f, 21.9443f, 7.3257f, 21.9998f, 9.4944f)
                curveTo(22.007f, 9.7725f, 21.7788f, 9.9947f, 21.5092f, 10.0652f)
                curveTo(20.6493f, 10.2901f, 20.0148f, 11.0711f, 20.0148f, 12.0f)
                curveTo(20.0148f, 12.9289f, 20.6493f, 13.7099f, 21.5092f, 13.9348f)
                curveTo(21.7788f, 14.0053f, 22.007f, 14.2275f, 21.9998f, 14.5056f)
                curveTo(21.9443f, 16.6743f, 21.7234f, 17.9514f, 20.8448f, 18.8284f)
                curveTo(19.671f, 20.0f, 17.7819f, 20.0f, 14.0037f, 20.0f)
                horizontalLineTo(9.9963f)
                curveTo(8.8287f, 20.0f, 7.8414f, 20.0f, 7.0f, 19.9654f)
            }
        }
        .build()
        return _ticketSale!!
    }

private var _ticketSale: ImageVector? = null
