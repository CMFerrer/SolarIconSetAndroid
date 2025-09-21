package dev.chiksmedina.solar.outline.foodkitchen

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.FoodKitchenGroup

val FoodKitchenGroup.ChefHatMinimalistic: ImageVector
    get() {
        if (_chefHatMinimalistic != null) {
            return _chefHatMinimalistic!!
        }
        _chefHatMinimalistic = Builder(
            name = "ChefHatMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.2529f, 4.2555f)
                curveTo(8.094f, 2.4795f, 9.9026f, 1.25f, 12.0f, 1.25f)
                curveTo(14.0974f, 1.25f, 15.906f, 2.4795f, 16.7471f, 4.2555f)
                curveTo(16.831f, 4.2518f, 16.9153f, 4.25f, 17.0f, 4.25f)
                curveTo(20.1756f, 4.25f, 22.75f, 6.8244f, 22.75f, 10.0f)
                curveTo(22.75f, 12.1806f, 21.5363f, 14.0762f, 19.75f, 15.0508f)
                lineTo(19.75f, 18.052f)
                curveTo(19.75f, 18.9505f, 19.7501f, 19.6997f, 19.6701f, 20.2945f)
                curveTo(19.5857f, 20.9223f, 19.4f, 21.4891f, 18.9445f, 21.9445f)
                curveTo(18.4891f, 22.4f, 17.9223f, 22.5857f, 17.2945f, 22.6701f)
                curveTo(16.6997f, 22.7501f, 15.9505f, 22.75f, 15.052f, 22.75f)
                horizontalLineTo(8.948f)
                curveTo(8.0495f, 22.75f, 7.3003f, 22.7501f, 6.7055f, 22.6701f)
                curveTo(6.0777f, 22.5857f, 5.5109f, 22.4f, 5.0555f, 21.9445f)
                curveTo(4.6f, 21.4891f, 4.4143f, 20.9223f, 4.3299f, 20.2945f)
                curveTo(4.2499f, 19.6997f, 4.25f, 18.9505f, 4.25f, 18.052f)
                lineTo(4.25f, 15.0508f)
                curveTo(2.4637f, 14.0762f, 1.25f, 12.1806f, 1.25f, 10.0f)
                curveTo(1.25f, 6.8244f, 3.8244f, 4.25f, 7.0f, 4.25f)
                curveTo(7.0847f, 4.25f, 7.169f, 4.2518f, 7.2529f, 4.2555f)
                close()
                moveTo(6.8026f, 5.7545f)
                curveTo(4.547f, 5.8576f, 2.75f, 7.7189f, 2.75f, 10.0f)
                curveTo(2.75f, 11.7416f, 3.7977f, 13.2402f, 5.3003f, 13.8967f)
                curveTo(5.5735f, 14.016f, 5.75f, 14.2859f, 5.75f, 14.584f)
                verticalLineTo(18.0f)
                curveTo(5.75f, 18.964f, 5.7516f, 19.6116f, 5.8165f, 20.0946f)
                curveTo(5.8786f, 20.5561f, 5.9858f, 20.7536f, 6.1161f, 20.8839f)
                curveTo(6.2464f, 21.0142f, 6.4439f, 21.1214f, 6.9054f, 21.1835f)
                curveTo(7.3884f, 21.2484f, 8.036f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(15.964f, 21.25f, 16.6116f, 21.2484f, 17.0946f, 21.1835f)
                curveTo(17.5561f, 21.1214f, 17.7536f, 21.0142f, 17.8839f, 20.8839f)
                curveTo(18.0142f, 20.7536f, 18.1214f, 20.5561f, 18.1835f, 20.0946f)
                curveTo(18.2484f, 19.6116f, 18.25f, 18.964f, 18.25f, 18.0f)
                lineTo(18.25f, 14.584f)
                curveTo(18.25f, 14.2859f, 18.4265f, 14.016f, 18.6997f, 13.8967f)
                curveTo(20.2023f, 13.2402f, 21.25f, 11.7416f, 21.25f, 10.0f)
                curveTo(21.25f, 7.7189f, 19.453f, 5.8576f, 17.1974f, 5.7545f)
                curveTo(17.2321f, 5.9983f, 17.25f, 6.2472f, 17.25f, 6.5f)
                verticalLineTo(7.0f)
                curveTo(17.25f, 7.4142f, 16.9142f, 7.75f, 16.5f, 7.75f)
                curveTo(16.0858f, 7.75f, 15.75f, 7.4142f, 15.75f, 7.0f)
                verticalLineTo(6.5f)
                curveTo(15.75f, 6.0771f, 15.6803f, 5.6721f, 15.5524f, 5.2949f)
                curveTo(15.0502f, 3.814f, 13.6484f, 2.75f, 12.0f, 2.75f)
                curveTo(10.3516f, 2.75f, 8.9498f, 3.814f, 8.4476f, 5.2949f)
                curveTo(8.3197f, 5.6721f, 8.25f, 6.0771f, 8.25f, 6.5f)
                verticalLineTo(7.0f)
                curveTo(8.25f, 7.4142f, 7.9142f, 7.75f, 7.5f, 7.75f)
                curveTo(7.0858f, 7.75f, 6.75f, 7.4142f, 6.75f, 7.0f)
                verticalLineTo(6.5f)
                curveTo(6.75f, 6.2472f, 6.7679f, 5.9983f, 6.8026f, 5.7545f)
                close()
                moveTo(8.25f, 18.0f)
                curveTo(8.25f, 17.5858f, 8.5858f, 17.25f, 9.0f, 17.25f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 17.25f, 15.75f, 17.5858f, 15.75f, 18.0f)
                curveTo(15.75f, 18.4142f, 15.4142f, 18.75f, 15.0f, 18.75f)
                horizontalLineTo(9.0f)
                curveTo(8.5858f, 18.75f, 8.25f, 18.4142f, 8.25f, 18.0f)
                close()
            }
        }
            .build()
        return _chefHatMinimalistic!!
    }

private var _chefHatMinimalistic: ImageVector? = null
