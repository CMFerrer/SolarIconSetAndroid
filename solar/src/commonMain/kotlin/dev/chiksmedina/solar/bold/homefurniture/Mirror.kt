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

val HomeFurnitureGroup.Mirror: ImageVector
    get() {
        if (_mirror != null) {
            return _mirror!!
        }
        _mirror = Builder(
            name = "Mirror", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.9655f, 8.7508f)
                curveTo(18.6146f, 4.9604f, 15.63f, 2.0f, 12.0f, 2.0f)
                curveTo(8.37f, 2.0f, 5.3854f, 4.9604f, 5.0345f, 8.7508f)
                curveTo(5.0231f, 8.7503f, 5.0116f, 8.75f, 5.0f, 8.75f)
                curveTo(4.5858f, 8.75f, 4.25f, 9.0858f, 4.25f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(4.25f, 19.4868f, 4.0921f, 19.9605f, 3.8f, 20.35f)
                lineTo(2.9f, 21.55f)
                curveTo(2.6515f, 21.8814f, 2.7187f, 22.3515f, 3.05f, 22.6f)
                curveTo(3.3814f, 22.8485f, 3.8515f, 22.7814f, 4.1f, 22.45f)
                lineTo(5.0f, 21.25f)
                curveTo(5.1192f, 21.0912f, 5.2249f, 20.9239f, 5.3167f, 20.75f)
                horizontalLineTo(18.6834f)
                curveTo(18.7752f, 20.9239f, 18.8809f, 21.0912f, 19.0f, 21.25f)
                lineTo(19.9f, 22.45f)
                curveTo(20.1486f, 22.7814f, 20.6187f, 22.8485f, 20.95f, 22.6f)
                curveTo(21.2814f, 22.3515f, 21.3486f, 21.8814f, 21.1f, 21.55f)
                lineTo(20.2f, 20.35f)
                curveTo(19.9079f, 19.9605f, 19.75f, 19.4868f, 19.75f, 19.0f)
                verticalLineTo(9.5f)
                curveTo(19.75f, 9.0858f, 19.4143f, 8.75f, 19.0f, 8.75f)
                curveTo(18.9885f, 8.75f, 18.977f, 8.7503f, 18.9655f, 8.7508f)
                close()
                moveTo(18.25f, 12.881f)
                curveTo(17.0962f, 15.3247f, 14.7307f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2694f, 17.0f, 6.9039f, 15.3248f, 5.75f, 12.8812f)
                verticalLineTo(19.0f)
                curveTo(5.75f, 19.0836f, 5.7473f, 19.167f, 5.7417f, 19.25f)
                horizontalLineTo(18.2584f)
                curveTo(18.2528f, 19.167f, 18.25f, 19.0836f, 18.25f, 19.0f)
                verticalLineTo(12.881f)
                close()
                moveTo(12.3938f, 4.9047f)
                curveTo(12.6201f, 4.5387f, 13.1497f, 4.3994f, 13.5767f, 4.5934f)
                curveTo(15.0268f, 5.2524f, 15.9871f, 6.7357f, 16.2786f, 8.388f)
                curveTo(16.3509f, 8.7976f, 16.0221f, 9.1798f, 15.5443f, 9.2417f)
                curveTo(15.0665f, 9.3037f, 14.6206f, 9.0219f, 14.5483f, 8.6123f)
                curveTo(14.3063f, 7.2407f, 13.5488f, 6.2785f, 12.757f, 5.9186f)
                curveTo(12.33f, 5.7246f, 12.1674f, 5.2707f, 12.3938f, 4.9047f)
                close()
            }
        }
            .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
