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

val MoneyGroup.SaleSquare: ImageVector
    get() {
        if (_saleSquare != null) {
            return _saleSquare!!
        }
        _saleSquare = Builder(
            name = "SaleSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.5303f, 8.4697f)
                curveTo(15.8232f, 8.7626f, 15.8232f, 9.2374f, 15.5303f, 9.5303f)
                lineTo(9.5303f, 15.5303f)
                curveTo(9.2374f, 15.8232f, 8.7626f, 15.8232f, 8.4697f, 15.5303f)
                curveTo(8.1768f, 15.2374f, 8.1768f, 14.7626f, 8.4697f, 14.4697f)
                lineTo(14.4697f, 8.4697f)
                curveTo(14.7626f, 8.1768f, 15.2374f, 8.1768f, 15.5303f, 8.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.5f, 15.5f)
                curveTo(15.0523f, 15.5f, 15.5f, 15.0523f, 15.5f, 14.5f)
                curveTo(15.5f, 13.9477f, 15.0523f, 13.5f, 14.5f, 13.5f)
                curveTo(13.9477f, 13.5f, 13.5f, 13.9477f, 13.5f, 14.5f)
                curveTo(13.5f, 15.0523f, 13.9477f, 15.5f, 14.5f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.5f, 10.5f)
                curveTo(10.0523f, 10.5f, 10.5f, 10.0523f, 10.5f, 9.5f)
                curveTo(10.5f, 8.9477f, 10.0523f, 8.5f, 9.5f, 8.5f)
                curveTo(8.9477f, 8.5f, 8.5f, 8.9477f, 8.5f, 9.5f)
                curveTo(8.5f, 10.0523f, 8.9477f, 10.5f, 9.5f, 10.5f)
                close()
            }
        }
            .build()
        return _saleSquare!!
    }

private var _saleSquare: ImageVector? = null
