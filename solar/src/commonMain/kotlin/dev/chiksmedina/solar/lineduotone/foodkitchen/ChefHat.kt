package dev.chiksmedina.solar.lineduotone.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.FoodKitchenGroup

val FoodKitchenGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(
            name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.0f, 18.0f)
                lineTo(19.75f, 18.0f)
                lineTo(19.75f, 18.0f)
                lineTo(19.0f, 18.0f)
                close()
                moveTo(5.0f, 14.584f)
                horizontalLineTo(5.75f)
                curveTo(5.75f, 14.2859f, 5.5735f, 14.016f, 5.3003f, 13.8967f)
                lineTo(5.0f, 14.584f)
                close()
                moveTo(19.0f, 14.584f)
                lineTo(18.6997f, 13.8967f)
                curveTo(18.4265f, 14.016f, 18.25f, 14.2859f, 18.25f, 14.584f)
                lineTo(19.0f, 14.584f)
                close()
                moveTo(15.75f, 7.0f)
                curveTo(15.75f, 7.4142f, 16.0858f, 7.75f, 16.5f, 7.75f)
                curveTo(16.9142f, 7.75f, 17.25f, 7.4142f, 17.25f, 7.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(6.75f, 7.0f)
                curveTo(6.75f, 7.4142f, 7.0858f, 7.75f, 7.5f, 7.75f)
                curveTo(7.9142f, 7.75f, 8.25f, 7.4142f, 8.25f, 7.0f)
                horizontalLineTo(6.75f)
                close()
                moveTo(7.0f, 4.25f)
                curveTo(3.8244f, 4.25f, 1.25f, 6.8244f, 1.25f, 10.0f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 7.6528f, 4.6528f, 5.75f, 7.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(17.0f, 5.75f)
                curveTo(19.3472f, 5.75f, 21.25f, 7.6528f, 21.25f, 10.0f)
                horizontalLineTo(22.75f)
                curveTo(22.75f, 6.8244f, 20.1756f, 4.25f, 17.0f, 4.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(15.0f, 21.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.25f)
                close()
                moveTo(9.0f, 21.25f)
                curveTo(8.036f, 21.25f, 7.3884f, 21.2484f, 6.9054f, 21.1835f)
                curveTo(6.4439f, 21.1214f, 6.2464f, 21.0142f, 6.1161f, 20.8839f)
                lineTo(5.0555f, 21.9445f)
                curveTo(5.5109f, 22.4f, 6.0777f, 22.5857f, 6.7055f, 22.6701f)
                curveTo(7.3117f, 22.7516f, 8.0784f, 22.75f, 9.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(4.25f, 18.0f)
                curveTo(4.25f, 18.9216f, 4.2484f, 19.6883f, 4.3299f, 20.2945f)
                curveTo(4.4143f, 20.9223f, 4.6f, 21.4891f, 5.0555f, 21.9445f)
                lineTo(6.1161f, 20.8839f)
                curveTo(5.9858f, 20.7536f, 5.8786f, 20.5561f, 5.8165f, 20.0946f)
                curveTo(5.7516f, 19.6116f, 5.75f, 18.964f, 5.75f, 18.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(18.25f, 18.0f)
                curveTo(18.25f, 18.964f, 18.2484f, 19.6116f, 18.1835f, 20.0946f)
                curveTo(18.1214f, 20.5561f, 18.0142f, 20.7536f, 17.8839f, 20.8839f)
                lineTo(18.9445f, 21.9445f)
                curveTo(19.4f, 21.4891f, 19.5857f, 20.9223f, 19.6701f, 20.2945f)
                curveTo(19.7516f, 19.6883f, 19.75f, 18.9216f, 19.75f, 18.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(15.0f, 22.75f)
                curveTo(15.9216f, 22.75f, 16.6883f, 22.7516f, 17.2945f, 22.6701f)
                curveTo(17.9223f, 22.5857f, 18.4891f, 22.4f, 18.9445f, 21.9445f)
                lineTo(17.8839f, 20.8839f)
                curveTo(17.7536f, 21.0142f, 17.5561f, 21.1214f, 17.0946f, 21.1835f)
                curveTo(16.6116f, 21.2484f, 15.964f, 21.25f, 15.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(7.0f, 5.75f)
                curveTo(7.2137f, 5.75f, 7.4233f, 5.7657f, 7.6277f, 5.7959f)
                lineTo(7.847f, 4.312f)
                curveTo(7.5702f, 4.2711f, 7.2873f, 4.25f, 7.0f, 4.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(12.0f, 1.25f)
                curveTo(9.6895f, 1.25f, 7.7294f, 2.7421f, 7.0271f, 4.8131f)
                lineTo(8.4476f, 5.2949f)
                curveTo(8.9498f, 3.814f, 10.3516f, 2.75f, 12.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(7.0271f, 4.8131f)
                curveTo(6.8472f, 5.3435f, 6.75f, 5.9112f, 6.75f, 6.5f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 6.0771f, 8.3197f, 5.6721f, 8.4476f, 5.2949f)
                lineTo(7.0271f, 4.8131f)
                close()
                moveTo(17.0f, 4.25f)
                curveTo(16.7127f, 4.25f, 16.4298f, 4.2711f, 16.153f, 4.312f)
                lineTo(16.3723f, 5.7959f)
                curveTo(16.5767f, 5.7657f, 16.7863f, 5.75f, 17.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(13.6484f, 2.75f, 15.0502f, 3.814f, 15.5524f, 5.2949f)
                lineTo(16.9729f, 4.8131f)
                curveTo(16.2706f, 2.7421f, 14.3105f, 1.25f, 12.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(15.5524f, 5.2949f)
                curveTo(15.6803f, 5.6721f, 15.75f, 6.0771f, 15.75f, 6.5f)
                horizontalLineTo(17.25f)
                curveTo(17.25f, 5.9112f, 17.1528f, 5.3435f, 16.9729f, 4.8131f)
                lineTo(15.5524f, 5.2949f)
                close()
                moveTo(5.75f, 18.0f)
                verticalLineTo(14.584f)
                horizontalLineTo(4.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(5.3003f, 13.8967f)
                curveTo(3.7977f, 13.2402f, 2.75f, 11.7416f, 2.75f, 10.0f)
                horizontalLineTo(1.25f)
                curveTo(1.25f, 12.359f, 2.6705f, 14.3846f, 4.6997f, 15.2712f)
                lineTo(5.3003f, 13.8967f)
                close()
                moveTo(18.25f, 14.584f)
                lineTo(18.25f, 18.0f)
                lineTo(19.75f, 18.0f)
                lineTo(19.75f, 14.584f)
                lineTo(18.25f, 14.584f)
                close()
                moveTo(21.25f, 10.0f)
                curveTo(21.25f, 11.7416f, 20.2023f, 13.2402f, 18.6997f, 13.8967f)
                lineTo(19.3003f, 15.2712f)
                curveTo(21.3295f, 14.3846f, 22.75f, 12.359f, 22.75f, 10.0f)
                horizontalLineTo(21.25f)
                close()
                moveTo(15.75f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(15.75f)
                close()
                moveTo(6.75f, 6.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.25f)
                verticalLineTo(6.5f)
                horizontalLineTo(6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 18.0f)
                horizontalLineTo(19.0f)
            }
        }
            .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null
