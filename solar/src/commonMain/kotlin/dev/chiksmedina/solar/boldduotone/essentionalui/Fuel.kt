package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Fuel: ImageVector
    get() {
        if (_fuel != null) {
            return _fuel!!
        }
        _fuel = Builder(
            name = "Fuel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.5533f, 9.1475f)
                curveTo(2.0f, 9.9424f, 2.0f, 10.9906f, 2.0f, 13.0869f)
                verticalLineTo(15.8834f)
                curveTo(2.0f, 18.7668f, 2.0f, 20.2085f, 2.8787f, 21.1042f)
                curveTo(3.7574f, 22.0f, 5.1716f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.8284f, 22.0f, 20.2426f, 22.0f, 21.1213f, 21.1042f)
                curveTo(22.0f, 20.2085f, 22.0f, 18.7668f, 22.0f, 15.8834f)
                verticalLineTo(10.2325f)
                curveTo(22.0f, 6.3054f, 22.0f, 4.3418f, 20.7359f, 3.4276f)
                curveTo(19.4718f, 2.5133f, 17.6539f, 3.162f, 14.0179f, 4.4593f)
                lineTo(6.0179f, 7.3137f)
                curveTo(4.077f, 8.0062f, 3.1065f, 8.3525f, 2.5533f, 9.1475f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.0162f, 5.5303f)
                lineTo(10.9442f, 5.2371f)
                curveTo(10.7929f, 4.6611f, 10.3519f, 4.2112f, 9.7872f, 4.0569f)
                curveTo(9.5791f, 4.0f, 9.3254f, 4.0f, 8.8182f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(6.7206f, 4.0f, 6.0809f, 4.0f, 5.6402f, 4.3449f)
                curveTo(5.5268f, 4.4337f, 5.4252f, 4.5373f, 5.3382f, 4.653f)
                curveTo(5.0f, 5.1025f, 5.0f, 5.7551f, 5.0f, 7.0601f)
                verticalLineTo(7.6812f)
                curveTo(5.3059f, 7.5677f, 5.6439f, 7.4472f, 6.0179f, 7.3137f)
                lineTo(11.0162f, 5.5303f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.4697f, 9.4697f)
                curveTo(7.1768f, 9.7626f, 7.1768f, 10.2374f, 7.4697f, 10.5303f)
                lineTo(8.9697f, 12.0303f)
                curveTo(9.008f, 12.0687f, 9.0495f, 12.102f, 9.0933f, 12.1304f)
                curveTo(9.0f, 12.564f, 9.0f, 13.1561f, 9.0f, 14.0f)
                curveTo(9.0f, 14.8313f, 9.0f, 15.4182f, 9.0892f, 15.8501f)
                lineTo(7.4697f, 17.4697f)
                curveTo(7.1768f, 17.7626f, 7.1768f, 18.2374f, 7.4697f, 18.5303f)
                curveTo(7.7626f, 18.8232f, 8.2374f, 18.8232f, 8.5303f, 18.5303f)
                lineTo(10.1499f, 16.9108f)
                curveTo(10.5818f, 17.0f, 11.1687f, 17.0f, 12.0f, 17.0f)
                curveTo(12.8313f, 17.0f, 13.4182f, 17.0f, 13.8501f, 16.9108f)
                lineTo(15.4697f, 18.5303f)
                curveTo(15.7626f, 18.8232f, 16.2374f, 18.8232f, 16.5303f, 18.5303f)
                curveTo(16.8232f, 18.2374f, 16.8232f, 17.7626f, 16.5303f, 17.4697f)
                lineTo(14.9108f, 15.8501f)
                curveTo(15.0f, 15.4182f, 15.0f, 14.8313f, 15.0f, 14.0f)
                curveTo(15.0f, 13.1687f, 15.0f, 12.5818f, 14.9108f, 12.1499f)
                lineTo(16.5303f, 10.5303f)
                curveTo(16.8232f, 10.2374f, 16.8232f, 9.7626f, 16.5303f, 9.4697f)
                curveTo(16.2374f, 9.1768f, 15.7626f, 9.1768f, 15.4697f, 9.4697f)
                lineTo(13.8501f, 11.0892f)
                curveTo(13.4182f, 11.0f, 12.8313f, 11.0f, 12.0f, 11.0f)
                curveTo(11.1561f, 11.0f, 10.564f, 11.0f, 10.1304f, 11.0933f)
                curveTo(10.102f, 11.0495f, 10.0687f, 11.008f, 10.0303f, 10.9697f)
                lineTo(8.5303f, 9.4697f)
                curveTo(8.2374f, 9.1768f, 7.7626f, 9.1768f, 7.4697f, 9.4697f)
                close()
            }
        }
            .build()
        return _fuel!!
    }

private var _fuel: ImageVector? = null
