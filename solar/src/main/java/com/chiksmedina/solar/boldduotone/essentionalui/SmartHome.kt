package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.SmartHome: ImageVector
    get() {
        if (_smartHome != null) {
            return _smartHome!!
        }
        _smartHome = Builder(name = "SmartHome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.7881f)
                curveTo(2.0f, 19.5763f, 2.0f, 17.6258f, 2.0f, 13.725f)
                verticalLineTo(12.2039f)
                curveTo(2.0f, 9.9155f, 2.0f, 8.7713f, 2.5192f, 7.8227f)
                curveTo(3.0384f, 6.8742f, 3.9869f, 6.2855f, 5.884f, 5.1081f)
                lineTo(7.884f, 3.8669f)
                curveTo(9.8894f, 2.6223f, 10.8921f, 2.0f, 12.0f, 2.0f)
                curveTo(13.1079f, 2.0f, 14.1106f, 2.6223f, 16.116f, 3.8669f)
                lineTo(18.116f, 5.1081f)
                curveTo(20.0131f, 6.2855f, 20.9616f, 6.8742f, 21.4808f, 7.8227f)
                curveTo(22.0f, 8.7713f, 22.0f, 9.9155f, 22.0f, 12.2039f)
                verticalLineTo(13.725f)
                curveTo(22.0f, 17.6258f, 22.0f, 19.5763f, 20.8284f, 20.7881f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.25f)
                curveTo(2.0f, 11.8358f, 2.3361f, 11.5f, 2.7506f, 11.5f)
                curveTo(8.1396f, 11.5f, 12.5083f, 15.8652f, 12.5083f, 21.25f)
                curveTo(12.5083f, 21.6642f, 12.1722f, 22.0f, 11.7577f, 22.0f)
                curveTo(11.3431f, 22.0f, 11.0071f, 21.6642f, 11.0071f, 21.25f)
                curveTo(11.0071f, 16.6937f, 7.3105f, 13.0f, 2.7506f, 13.0f)
                curveTo(2.3361f, 13.0f, 2.0f, 12.6642f, 2.0f, 12.25f)
                close()
                moveTo(2.7506f, 14.5f)
                curveTo(2.3361f, 14.5f, 2.0f, 14.8358f, 2.0f, 15.25f)
                curveTo(2.0f, 15.6642f, 2.3361f, 16.0f, 2.7506f, 16.0f)
                curveTo(5.6524f, 16.0f, 8.0047f, 18.3505f, 8.0047f, 21.25f)
                curveTo(8.0047f, 21.6642f, 8.3408f, 22.0f, 8.7553f, 22.0f)
                curveTo(9.1699f, 22.0f, 9.5059f, 21.6642f, 9.5059f, 21.25f)
                curveTo(9.5059f, 17.5221f, 6.4815f, 14.5f, 2.7506f, 14.5f)
                close()
                moveTo(2.0f, 18.25f)
                curveTo(2.0f, 17.8358f, 2.3361f, 17.5f, 2.7506f, 17.5f)
                curveTo(4.8233f, 17.5f, 6.5035f, 19.1789f, 6.5035f, 21.25f)
                curveTo(6.5035f, 21.6642f, 6.1675f, 22.0f, 5.753f, 22.0f)
                curveTo(5.3384f, 22.0f, 5.0024f, 21.6642f, 5.0024f, 21.25f)
                curveTo(5.0024f, 20.0074f, 3.9942f, 19.0f, 2.7506f, 19.0f)
                curveTo(2.3361f, 19.0f, 2.0f, 18.6642f, 2.0f, 18.25f)
                close()
            }
        }
        .build()
        return _smartHome!!
    }

private var _smartHome: ImageVector? = null
