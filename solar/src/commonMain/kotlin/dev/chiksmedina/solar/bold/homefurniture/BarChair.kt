package dev.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.HomeFurnitureGroup

val HomeFurnitureGroup.BarChair: ImageVector
    get() {
        if (_barChair != null) {
            return _barChair!!
        }
        _barChair = Builder(
            name = "BarChair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.7547f, 2.3084f)
                curveTo(6.6521f, 2.6688f, 5.2024f, 4.6158f, 5.4597f, 6.7334f)
                lineTo(5.4767f, 6.8727f)
                curveTo(5.5377f, 7.3746f, 5.9637f, 7.752f, 6.4694f, 7.752f)
                horizontalLineTo(8.2331f)
                lineTo(5.2668f, 21.5947f)
                curveTo(5.18f, 21.9997f, 5.438f, 22.3984f, 5.843f, 22.4852f)
                curveTo(6.248f, 22.572f, 6.6467f, 22.314f, 6.7335f, 21.909f)
                lineTo(7.6779f, 17.5019f)
                horizontalLineTo(16.3224f)
                lineTo(17.2668f, 21.909f)
                curveTo(17.3536f, 22.314f, 17.7523f, 22.572f, 18.1573f, 22.4852f)
                curveTo(18.5623f, 22.3984f, 18.8203f, 21.9997f, 18.7335f, 21.5947f)
                lineTo(15.7672f, 7.752f)
                horizontalLineTo(17.531f)
                curveTo(18.0367f, 7.752f, 18.4627f, 7.3746f, 18.5237f, 6.8727f)
                lineTo(18.5406f, 6.7334f)
                curveTo(18.798f, 4.6158f, 17.3483f, 2.6688f, 15.2457f, 2.3084f)
                lineTo(14.8726f, 2.2444f)
                curveTo(12.9715f, 1.9185f, 11.0289f, 1.9185f, 9.1278f, 2.2444f)
                lineTo(8.7547f, 2.3084f)
                close()
                moveTo(14.25f, 7.752f)
                horizontalLineTo(9.7503f)
                curveTo(9.7502f, 7.8038f, 9.7448f, 7.8563f, 9.7335f, 7.909f)
                lineTo(7.9993f, 16.0019f)
                horizontalLineTo(16.001f)
                lineTo(14.2668f, 7.909f)
                curveTo(14.2555f, 7.8563f, 14.2501f, 7.8038f, 14.25f, 7.752f)
                close()
            }
        }
            .build()
        return _barChair!!
    }

private var _barChair: ImageVector? = null
