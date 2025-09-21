package dev.chiksmedina.solar.broken.shoppingecommerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.ShoppingEcommerceGroup

val ShoppingEcommerceGroup.Bag5: ImageVector
    get() {
        if (_bag5 != null) {
            return _bag5!!
        }
        _bag5 = Builder(
            name = "Bag5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.2059f, 14.9709f)
                curveTo(19.6687f, 17.6567f, 19.4001f, 18.9996f, 18.5127f, 19.8646f)
                curveTo(18.3486f, 20.0244f, 18.1712f, 20.1699f, 17.9823f, 20.2994f)
                curveTo(16.9601f, 21.0f, 15.5906f, 21.0f, 12.8515f, 21.0f)
                horizontalLineTo(11.1486f)
                curveTo(8.4096f, 21.0f, 7.04f, 21.0f, 6.0179f, 20.2994f)
                curveTo(5.8289f, 20.1699f, 5.6515f, 20.0244f, 5.4875f, 19.8646f)
                curveTo(4.6f, 18.9996f, 4.3314f, 17.6567f, 3.7942f, 14.9709f)
                curveTo(3.023f, 11.1149f, 2.6374f, 9.1869f, 3.5251f, 7.8207f)
                curveTo(3.6858f, 7.5733f, 3.8734f, 7.3445f, 4.0845f, 7.1384f)
                curveTo(5.25f, 6.0f, 7.2162f, 6.0f, 11.1486f, 6.0f)
                horizontalLineTo(12.8515f)
                curveTo(16.7839f, 6.0f, 18.7501f, 6.0f, 19.9157f, 7.1384f)
                curveTo(20.1267f, 7.3445f, 20.3143f, 7.5733f, 20.475f, 7.8207f)
                curveTo(20.9861f, 8.6073f, 21.0751f, 9.5801f, 20.9114f, 11.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 10.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.0f, 6.0f)
                verticalLineTo(5.0f)
                curveTo(9.0f, 3.3431f, 10.3431f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6569f, 2.0f, 15.0f, 3.3431f, 15.0f, 5.0f)
                verticalLineTo(6.0f)
            }
        }
            .build()
        return _bag5!!
    }

private var _bag5: ImageVector? = null
