package dev.chiksmedina.solar.outline.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.HomeFurnitureGroup

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
                moveTo(12.0f, 2.75f)
                curveTo(9.248f, 2.75f, 6.75f, 5.6073f, 6.75f, 9.5f)
                curveTo(6.75f, 13.3927f, 9.248f, 16.25f, 12.0f, 16.25f)
                curveTo(14.752f, 16.25f, 17.25f, 13.3927f, 17.25f, 9.5f)
                curveTo(17.25f, 5.6073f, 14.752f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(5.2743f, 8.8017f)
                curveTo(5.5598f, 4.7075f, 8.3314f, 1.25f, 12.0f, 1.25f)
                curveTo(15.6685f, 1.25f, 18.4402f, 4.7075f, 18.7257f, 8.8017f)
                curveTo(18.8106f, 8.7683f, 18.9032f, 8.75f, 19.0f, 8.75f)
                curveTo(19.4142f, 8.75f, 19.75f, 9.0858f, 19.75f, 9.5f)
                verticalLineTo(19.0f)
                curveTo(19.75f, 19.4868f, 19.9079f, 19.9605f, 20.2f, 20.35f)
                lineTo(21.1f, 21.55f)
                curveTo(21.3485f, 21.8814f, 21.2814f, 22.3515f, 20.95f, 22.6f)
                curveTo(20.6186f, 22.8485f, 20.1485f, 22.7814f, 19.9f, 22.45f)
                lineTo(19.0f, 21.25f)
                curveTo(18.8809f, 21.0912f, 18.7751f, 20.9239f, 18.6834f, 20.75f)
                horizontalLineTo(5.3166f)
                curveTo(5.2249f, 20.9239f, 5.1191f, 21.0912f, 5.0f, 21.25f)
                lineTo(4.1f, 22.45f)
                curveTo(3.8515f, 22.7814f, 3.3814f, 22.8485f, 3.05f, 22.6f)
                curveTo(2.7186f, 22.3515f, 2.6514f, 21.8814f, 2.9f, 21.55f)
                lineTo(3.8f, 20.35f)
                curveTo(4.0921f, 19.9605f, 4.25f, 19.4868f, 4.25f, 19.0f)
                verticalLineTo(9.5f)
                curveTo(4.25f, 9.0858f, 4.5858f, 8.75f, 5.0f, 8.75f)
                curveTo(5.0968f, 8.75f, 5.1893f, 8.7683f, 5.2743f, 8.8017f)
                close()
                moveTo(5.75f, 12.6128f)
                verticalLineTo(19.0f)
                curveTo(5.75f, 19.0836f, 5.7472f, 19.167f, 5.7416f, 19.25f)
                horizontalLineTo(18.2583f)
                curveTo(18.2528f, 19.167f, 18.25f, 19.0836f, 18.25f, 19.0f)
                verticalLineTo(12.6128f)
                curveTo(17.2655f, 15.5653f, 14.9161f, 17.75f, 12.0f, 17.75f)
                curveTo(9.0839f, 17.75f, 6.7344f, 15.5653f, 5.75f, 12.6128f)
                close()
                moveTo(12.3374f, 4.9047f)
                curveTo(12.5314f, 4.5388f, 12.9853f, 4.3994f, 13.3513f, 4.5934f)
                curveTo(14.5943f, 5.2524f, 15.4173f, 6.7358f, 15.6672f, 8.388f)
                curveTo(15.7292f, 8.7976f, 15.4474f, 9.1798f, 15.0378f, 9.2418f)
                curveTo(14.6283f, 9.3037f, 14.246f, 9.0219f, 14.1841f, 8.6124f)
                curveTo(13.9767f, 7.2408f, 13.3274f, 6.2785f, 12.6487f, 5.9187f)
                curveTo(12.2827f, 5.7247f, 12.1433f, 5.2707f, 12.3374f, 4.9047f)
                close()
            }
        }
            .build()
        return _mirror!!
    }

private var _mirror: ImageVector? = null
