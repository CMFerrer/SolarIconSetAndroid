package com.chiksmedina.solar.bold.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsActionGroup

public val ArrowsActionGroup.UndoLeftSquare: ImageVector
    get() {
        if (_undoLeftSquare != null) {
            return _undoLeftSquare!!
        }
        _undoLeftSquare = Builder(name = "UndoLeftSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0f)
                curveTo(2.0f, 16.714f, 2.0f, 19.0711f, 3.4645f, 20.5355f)
                curveTo(4.9289f, 22.0f, 7.286f, 22.0f, 12.0f, 22.0f)
                curveTo(16.714f, 22.0f, 19.0711f, 22.0f, 20.5355f, 20.5355f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.7141f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                close()
                moveTo(9.2587f, 7.9739f)
                curveTo(9.5631f, 7.693f, 9.5821f, 7.2185f, 9.3011f, 6.9141f)
                curveTo(9.0202f, 6.6098f, 8.5456f, 6.5908f, 8.2413f, 6.8717f)
                lineTo(5.9913f, 8.9487f)
                curveTo(5.8375f, 9.0906f, 5.75f, 9.2905f, 5.75f, 9.4998f)
                curveTo(5.75f, 9.7091f, 5.8375f, 9.9089f, 5.9913f, 10.0509f)
                lineTo(8.2413f, 12.1278f)
                curveTo(8.5456f, 12.4088f, 9.0202f, 12.3898f, 9.3011f, 12.0854f)
                curveTo(9.5821f, 11.781f, 9.5631f, 11.3065f, 9.2587f, 11.0256f)
                lineTo(8.4182f, 10.2498f)
                horizontalLineTo(14.0385f)
                curveTo(14.7376f, 10.2498f, 15.2069f, 10.2506f, 15.5652f, 10.2862f)
                curveTo(15.9116f, 10.3205f, 16.0724f, 10.3813f, 16.1787f, 10.4501f)
                curveTo(16.3272f, 10.5461f, 16.4537f, 10.6726f, 16.5497f, 10.8211f)
                curveTo(16.6184f, 10.9274f, 16.6793f, 11.0882f, 16.7136f, 11.4345f)
                curveTo(16.7491f, 11.7929f, 16.75f, 12.2622f, 16.75f, 12.9613f)
                curveTo(16.75f, 13.6604f, 16.7491f, 14.1298f, 16.7136f, 14.4881f)
                curveTo(16.6793f, 14.8344f, 16.6185f, 14.9952f, 16.5497f, 15.1015f)
                curveTo(16.4537f, 15.2501f, 16.3272f, 15.3765f, 16.1787f, 15.4726f)
                curveTo(16.0724f, 15.5413f, 15.9116f, 15.6021f, 15.5652f, 15.6365f)
                curveTo(15.2069f, 15.672f, 14.7376f, 15.6729f, 14.0385f, 15.6729f)
                horizontalLineTo(9.5f)
                curveTo(9.0858f, 15.6729f, 8.75f, 16.0086f, 8.75f, 16.4229f)
                curveTo(8.75f, 16.8371f, 9.0858f, 17.1729f, 9.5f, 17.1729f)
                horizontalLineTo(14.0758f)
                curveTo(14.7279f, 17.1729f, 15.2721f, 17.1729f, 15.7133f, 17.1291f)
                curveTo(16.1748f, 17.0834f, 16.6038f, 16.9839f, 16.9931f, 16.7322f)
                curveTo(17.3199f, 16.5209f, 17.5981f, 16.2427f, 17.8094f, 15.916f)
                curveTo(18.0611f, 15.5266f, 18.1605f, 15.0976f, 18.2063f, 14.6361f)
                curveTo(18.25f, 14.195f, 18.25f, 13.6508f, 18.25f, 12.9987f)
                verticalLineTo(12.924f)
                curveTo(18.25f, 12.2718f, 18.25f, 11.7276f, 18.2063f, 11.2865f)
                curveTo(18.1605f, 10.825f, 18.0611f, 10.396f, 17.8093f, 10.0067f)
                curveTo(17.5981f, 9.6799f, 17.3199f, 9.4017f, 16.9931f, 9.1904f)
                curveTo(16.6038f, 8.9387f, 16.1748f, 8.8393f, 15.7133f, 8.7935f)
                curveTo(15.2721f, 8.7498f, 14.7279f, 8.7498f, 14.0758f, 8.7498f)
                lineTo(8.4182f, 8.7498f)
                lineTo(9.2587f, 7.9739f)
                close()
            }
        }
        .build()
        return _undoLeftSquare!!
    }

private var _undoLeftSquare: ImageVector? = null
