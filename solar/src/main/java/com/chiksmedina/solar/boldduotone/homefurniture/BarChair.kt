package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

public val HomeFurnitureGroup.BarChair: ImageVector
    get() {
        if (_barChair != null) {
            return _barChair!!
        }
        _barChair = Builder(name = "BarChair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.4597f, 6.7334f)
                curveTo(5.2024f, 4.6158f, 6.6521f, 2.6688f, 8.7547f, 2.3084f)
                lineTo(9.1278f, 2.2444f)
                curveTo(11.0289f, 1.9185f, 12.9715f, 1.9185f, 14.8726f, 2.2444f)
                lineTo(15.2457f, 2.3084f)
                curveTo(17.3483f, 2.6688f, 18.798f, 4.6158f, 18.5406f, 6.7334f)
                lineTo(18.5237f, 6.8727f)
                curveTo(18.4627f, 7.3746f, 18.0367f, 7.752f, 17.531f, 7.752f)
                horizontalLineTo(15.7672f)
                horizontalLineTo(14.25f)
                horizontalLineTo(9.7503f)
                horizontalLineTo(8.2331f)
                horizontalLineTo(6.4694f)
                curveTo(5.9637f, 7.752f, 5.5377f, 7.3746f, 5.4767f, 6.8727f)
                lineTo(5.4597f, 6.7334f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.2331f, 7.7519f)
                lineTo(5.2668f, 21.5947f)
                curveTo(5.18f, 21.9997f, 5.438f, 22.3984f, 5.843f, 22.4852f)
                curveTo(6.248f, 22.5719f, 6.6467f, 22.314f, 6.7335f, 21.909f)
                lineTo(7.6779f, 17.5018f)
                horizontalLineTo(16.3224f)
                lineTo(17.2668f, 21.909f)
                curveTo(17.3536f, 22.314f, 17.7523f, 22.5719f, 18.1573f, 22.4852f)
                curveTo(18.5623f, 22.3984f, 18.8203f, 21.9997f, 18.7335f, 21.5947f)
                lineTo(15.7672f, 7.7519f)
                horizontalLineTo(14.25f)
                curveTo(14.2501f, 7.8037f, 14.2555f, 7.8563f, 14.2668f, 7.9089f)
                lineTo(16.001f, 16.0018f)
                horizontalLineTo(7.9993f)
                lineTo(9.7335f, 7.9089f)
                curveTo(9.7448f, 7.8563f, 9.7502f, 7.8037f, 9.7503f, 7.7519f)
                horizontalLineTo(8.2331f)
                close()
            }
        }
        .build()
        return _barChair!!
    }

private var _barChair: ImageVector? = null
