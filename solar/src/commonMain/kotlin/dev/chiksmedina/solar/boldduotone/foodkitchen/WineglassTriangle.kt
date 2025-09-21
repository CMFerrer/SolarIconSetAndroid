package dev.chiksmedina.solar.boldduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.FoodKitchenGroup

val FoodKitchenGroup.WineglassTriangle: ImageVector
    get() {
        if (_wineglassTriangle != null) {
            return _wineglassTriangle!!
        }
        _wineglassTriangle = Builder(
            name = "WineglassTriangle", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.2991f, 3.0f)
                horizontalLineTo(4.701f)
                curveTo(3.2001f, 3.0f, 2.4376f, 4.7941f, 3.4838f, 5.8638f)
                lineTo(11.2851f, 13.8404f)
                curveTo(11.6773f, 14.2415f, 12.3227f, 14.2415f, 12.7149f, 13.8404f)
                lineTo(20.5162f, 5.8638f)
                curveTo(21.5624f, 4.7941f, 20.7999f, 3.0f, 19.2991f, 3.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.0061f, 21.0f)
                curveTo(7.0061f, 20.5858f, 7.3419f, 20.25f, 7.7561f, 20.25f)
                horizontalLineTo(16.2439f)
                curveTo(16.6581f, 20.25f, 16.9939f, 20.5858f, 16.9939f, 21.0f)
                curveTo(16.9939f, 21.4142f, 16.6581f, 21.75f, 16.2439f, 21.75f)
                horizontalLineTo(7.7561f)
                curveTo(7.3419f, 21.75f, 7.0061f, 21.4142f, 7.0061f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.2851f, 13.8404f)
                curveTo(11.6773f, 14.2415f, 12.3227f, 14.2415f, 12.7149f, 13.8404f)
                lineTo(16.4709f, 10.0f)
                horizontalLineTo(7.529f)
                lineTo(11.2851f, 13.8404f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.2853f, 13.8408f)
                curveTo(11.6776f, 14.2419f, 12.3229f, 14.2419f, 12.7152f, 13.8408f)
                lineTo(12.75f, 13.8052f)
                verticalLineTo(20.2502f)
                horizontalLineTo(11.25f)
                verticalLineTo(13.8047f)
                lineTo(11.2853f, 13.8408f)
                close()
            }
        }
            .build()
        return _wineglassTriangle!!
    }

private var _wineglassTriangle: ImageVector? = null
