package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(
            name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.75f, 19.0f)
                curveTo(8.75f, 18.5858f, 8.4142f, 18.25f, 8.0f, 18.25f)
                curveTo(7.5858f, 18.25f, 7.25f, 18.5858f, 7.25f, 19.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(11.25f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.25f)
                close()
                moveTo(8.75f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.25f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(12.0f, 12.75f)
                horizontalLineTo(21.5238f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.75f)
                close()
                moveTo(12.4762f, 1.25f)
                horizontalLineTo(11.5238f)
                verticalLineTo(2.75f)
                horizontalLineTo(12.4762f)
                verticalLineTo(1.25f)
                close()
                moveTo(2.4762f, 12.75f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.25f)
                horizontalLineTo(2.4762f)
                verticalLineTo(12.75f)
                close()
                moveTo(1.25f, 11.5238f)
                curveTo(1.25f, 12.201f, 1.799f, 12.75f, 2.4762f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(2.6274f, 11.25f, 2.75f, 11.3726f, 2.75f, 11.5238f)
                horizontalLineTo(1.25f)
                close()
                moveTo(22.75f, 11.5238f)
                curveTo(22.75f, 5.8497f, 18.1503f, 1.25f, 12.4762f, 1.25f)
                verticalLineTo(2.75f)
                curveTo(17.3218f, 2.75f, 21.25f, 6.6782f, 21.25f, 11.5238f)
                horizontalLineTo(22.75f)
                close()
                moveTo(21.5238f, 12.75f)
                curveTo(22.201f, 12.75f, 22.75f, 12.201f, 22.75f, 11.5238f)
                horizontalLineTo(21.25f)
                curveTo(21.25f, 11.3726f, 21.3726f, 11.25f, 21.5238f, 11.25f)
                verticalLineTo(12.75f)
                close()
                moveTo(10.0f, 21.25f)
                curveTo(9.3096f, 21.25f, 8.75f, 20.6904f, 8.75f, 20.0f)
                horizontalLineTo(7.25f)
                curveTo(7.25f, 21.5188f, 8.4812f, 22.75f, 10.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(11.5238f, 1.25f)
                curveTo(5.8497f, 1.25f, 1.25f, 5.8497f, 1.25f, 11.5238f)
                horizontalLineTo(2.75f)
                curveTo(2.75f, 6.6782f, 6.6782f, 2.75f, 11.5238f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(11.25f, 20.0f)
                curveTo(11.25f, 20.6904f, 10.6904f, 21.25f, 10.0f, 21.25f)
                verticalLineTo(22.75f)
                curveTo(11.5188f, 22.75f, 12.75f, 21.5188f, 12.75f, 20.0f)
                horizontalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.9143f, 12.0f)
                curveTo(16.6351f, 9.2887f, 15.5541f, 2.0f, 12.0f, 2.0f)
                curveTo(8.4459f, 2.0f, 7.3649f, 9.2887f, 7.0857f, 12.0f)
            }
        }
            .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
