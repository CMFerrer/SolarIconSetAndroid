package com.chiksmedina.solar.boldduotone.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MoneyGroup

val MoneyGroup.BillCheck: ImageVector
    get() {
        if (_billCheck != null) {
            return _billCheck!!
        }
        _billCheck = Builder(
            name = "BillCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
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
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0595f, 8.4995f)
                curveTo(15.3353f, 8.1905f, 15.3085f, 7.7164f, 14.9995f, 7.4405f)
                curveTo(14.6905f, 7.1647f, 14.2164f, 7.1915f, 13.9405f, 7.5005f)
                lineTo(10.9286f, 10.8739f)
                lineTo(10.0595f, 9.9005f)
                curveTo(9.7836f, 9.5915f, 9.3095f, 9.5647f, 9.0005f, 9.8406f)
                curveTo(8.6915f, 10.1164f, 8.6647f, 10.5905f, 8.9405f, 10.8995f)
                lineTo(10.3691f, 12.4995f)
                curveTo(10.5114f, 12.6589f, 10.7149f, 12.75f, 10.9286f, 12.75f)
                curveTo(11.1422f, 12.75f, 11.3457f, 12.6589f, 11.488f, 12.4995f)
                lineTo(15.0595f, 8.4995f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 14.75f)
                curveTo(7.0858f, 14.75f, 6.75f, 15.0858f, 6.75f, 15.5f)
                curveTo(6.75f, 15.9142f, 7.0858f, 16.25f, 7.5f, 16.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 16.25f, 17.25f, 15.9142f, 17.25f, 15.5f)
                curveTo(17.25f, 15.0858f, 16.9142f, 14.75f, 16.5f, 14.75f)
                horizontalLineTo(7.5f)
                close()
            }
        }
            .build()
        return _billCheck!!
    }

private var _billCheck: ImageVector? = null
