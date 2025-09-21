package dev.chiksmedina.solar.boldduotone.arrowsaction

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
import dev.chiksmedina.solar.boldduotone.ArrowsActionGroup

val ArrowsActionGroup.UndoLeft: ImageVector
    get() {
        if (_undoLeft != null) {
            return _undoLeft!!
        }
        _undoLeft = Builder(
            name = "UndoLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.5303f, 3.4697f)
                curveTo(7.8232f, 3.7626f, 7.8232f, 4.2374f, 7.5303f, 4.5303f)
                lineTo(5.0607f, 7.0f)
                lineTo(7.5303f, 9.4697f)
                curveTo(7.8232f, 9.7626f, 7.8232f, 10.2374f, 7.5303f, 10.5303f)
                curveTo(7.2374f, 10.8232f, 6.7626f, 10.8232f, 6.4697f, 10.5303f)
                lineTo(3.4697f, 7.5303f)
                curveTo(3.1768f, 7.2374f, 3.1768f, 6.7626f, 3.4697f, 6.4697f)
                lineTo(6.4697f, 3.4697f)
                curveTo(6.7626f, 3.1768f, 7.2374f, 3.1768f, 7.5303f, 3.4697f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0606f, 7.0f)
                lineTo(5.8106f, 6.25f)
                horizontalLineTo(15.0357f)
                curveTo(15.9399f, 6.25f, 16.6692f, 6.25f, 17.2575f, 6.3033f)
                curveTo(17.8638f, 6.3583f, 18.3936f, 6.4746f, 18.8749f, 6.7524f)
                curveTo(19.445f, 7.0815f, 19.9184f, 7.5549f, 20.2475f, 8.125f)
                curveTo(20.5253f, 8.6062f, 20.6416f, 9.136f, 20.6966f, 9.7424f)
                curveTo(20.7499f, 10.3307f, 20.7499f, 11.06f, 20.7499f, 11.9643f)
                verticalLineTo(12.0358f)
                curveTo(20.7499f, 12.94f, 20.7499f, 13.6693f, 20.6966f, 14.2576f)
                curveTo(20.6416f, 14.8639f, 20.5253f, 15.3938f, 20.2475f, 15.875f)
                curveTo(19.9184f, 16.4451f, 19.445f, 16.9185f, 18.8749f, 17.2476f)
                curveTo(18.3936f, 17.5254f, 17.8638f, 17.6417f, 17.2575f, 17.6967f)
                curveTo(16.6692f, 17.75f, 15.9399f, 17.75f, 15.0357f, 17.75f)
                horizontalLineTo(7.9999f)
                curveTo(7.5857f, 17.75f, 7.2499f, 17.4142f, 7.2499f, 17.0f)
                curveTo(7.2499f, 16.5858f, 7.5857f, 16.25f, 7.9999f, 16.25f)
                horizontalLineTo(14.9999f)
                curveTo(15.9483f, 16.25f, 16.6095f, 16.2493f, 17.1221f, 16.2028f)
                curveTo(17.6244f, 16.1573f, 17.91f, 16.0726f, 18.1249f, 15.9486f)
                curveTo(18.4669f, 15.7511f, 18.751f, 15.467f, 18.9485f, 15.125f)
                curveTo(19.0725f, 14.9101f, 19.1572f, 14.6245f, 19.2027f, 14.1222f)
                curveTo(19.2492f, 13.6096f, 19.2499f, 12.9484f, 19.2499f, 12.0f)
                curveTo(19.2499f, 11.0516f, 19.2492f, 10.3904f, 19.2027f, 9.8778f)
                curveTo(19.1572f, 9.3755f, 19.0725f, 9.0899f, 18.9484f, 8.875f)
                curveTo(18.751f, 8.533f, 18.4669f, 8.2489f, 18.1249f, 8.0514f)
                curveTo(17.91f, 7.9274f, 17.6244f, 7.8427f, 17.1221f, 7.7972f)
                curveTo(16.6095f, 7.7507f, 15.9483f, 7.75f, 14.9999f, 7.75f)
                horizontalLineTo(5.8106f)
                lineTo(5.0606f, 7.0f)
                close()
            }
        }
            .build()
        return _undoLeft!!
    }

private var _undoLeft: ImageVector? = null
