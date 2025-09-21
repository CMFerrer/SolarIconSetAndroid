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

val ArrowsActionGroup.UndoRightSquare: ImageVector
    get() {
        if (_undoRightSquare != null) {
            return _undoRightSquare!!
        }
        _undoRightSquare = Builder(
            name = "UndoRightSquare", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.6989f, 6.9142f)
                curveTo(14.9799f, 6.6098f, 15.4543f, 6.5908f, 15.7587f, 6.8717f)
                lineTo(18.0087f, 8.9487f)
                curveTo(18.1625f, 9.0907f, 18.25f, 9.2905f, 18.25f, 9.4998f)
                curveTo(18.25f, 9.7091f, 18.1625f, 9.9089f, 18.0087f, 10.0509f)
                lineTo(15.7587f, 12.1278f)
                curveTo(15.4543f, 12.4088f, 14.9799f, 12.3898f, 14.6989f, 12.0854f)
                curveTo(14.4179f, 11.781f, 14.4369f, 11.3066f, 14.7413f, 11.0256f)
                lineTo(15.5818f, 10.2498f)
                horizontalLineTo(9.9615f)
                curveTo(9.2624f, 10.2498f, 8.7931f, 10.2506f, 8.4348f, 10.2862f)
                curveTo(8.0884f, 10.3205f, 7.9276f, 10.3813f, 7.8213f, 10.4501f)
                curveTo(7.6728f, 10.5461f, 7.5463f, 10.6726f, 7.4503f, 10.8211f)
                curveTo(7.3815f, 10.9274f, 7.3208f, 11.0882f, 7.2864f, 11.4345f)
                curveTo(7.2509f, 11.7929f, 7.25f, 12.2622f, 7.25f, 12.9613f)
                curveTo(7.25f, 13.6604f, 7.2509f, 14.1298f, 7.2864f, 14.4881f)
                curveTo(7.3207f, 14.8344f, 7.3815f, 14.9952f, 7.4503f, 15.1015f)
                curveTo(7.5463f, 15.2501f, 7.6728f, 15.3765f, 7.8213f, 15.4726f)
                curveTo(7.9276f, 15.5413f, 8.0884f, 15.6021f, 8.4348f, 15.6365f)
                curveTo(8.7931f, 15.672f, 9.2624f, 15.6729f, 9.9615f, 15.6729f)
                horizontalLineTo(14.5f)
                curveTo(14.9142f, 15.6729f, 15.25f, 16.0086f, 15.25f, 16.4229f)
                curveTo(15.25f, 16.8371f, 14.9142f, 17.1729f, 14.5f, 17.1729f)
                horizontalLineTo(9.9242f)
                curveTo(9.2721f, 17.1729f, 8.7279f, 17.1729f, 8.2867f, 17.1291f)
                curveTo(7.8252f, 17.0834f, 7.3962f, 16.9839f, 7.0069f, 16.7322f)
                curveTo(6.6801f, 16.5209f, 6.4019f, 16.2427f, 6.1906f, 15.916f)
                curveTo(5.9389f, 15.5266f, 5.8395f, 15.0976f, 5.7937f, 14.6361f)
                curveTo(5.75f, 14.195f, 5.75f, 13.6508f, 5.75f, 12.9986f)
                verticalLineTo(12.924f)
                curveTo(5.75f, 12.2718f, 5.75f, 11.7276f, 5.7937f, 11.2865f)
                curveTo(5.8395f, 10.825f, 5.9389f, 10.396f, 6.1906f, 10.0067f)
                curveTo(6.4019f, 9.6799f, 6.6801f, 9.4017f, 7.0069f, 9.1904f)
                curveTo(7.3962f, 8.9387f, 7.8252f, 8.8393f, 8.2867f, 8.7935f)
                curveTo(8.7279f, 8.7498f, 9.2721f, 8.7498f, 9.9242f, 8.7498f)
                lineTo(15.5818f, 8.7498f)
                lineTo(14.7413f, 7.974f)
                curveTo(14.4369f, 7.693f, 14.4179f, 7.2185f, 14.6989f, 6.9142f)
                close()
            }
        }
            .build()
        return _undoRightSquare!!
    }

private var _undoRightSquare: ImageVector? = null
