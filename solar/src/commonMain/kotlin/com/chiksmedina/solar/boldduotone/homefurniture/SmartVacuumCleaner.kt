package com.chiksmedina.solar.boldduotone.homefurniture

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
import com.chiksmedina.solar.boldduotone.HomeFurnitureGroup

val HomeFurnitureGroup.SmartVacuumCleaner: ImageVector
    get() {
        if (_smartVacuumCleaner != null) {
            return _smartVacuumCleaner!!
        }
        _smartVacuumCleaner = Builder(
            name = "SmartVacuumCleaner", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.4413f, 19.427f)
                lineTo(15.441f, 20.5447f)
                lineTo(15.9998f, 21.0449f)
                curveTo(16.6628f, 21.6383f, 17.54f, 22.0f, 18.5f, 22.0f)
                curveTo(20.5711f, 22.0f, 22.25f, 20.321f, 22.25f, 18.25f)
                curveTo(22.25f, 17.29f, 21.8883f, 16.4127f, 21.295f, 15.7498f)
                lineTo(20.7948f, 15.1909f)
                lineTo(19.6771f, 16.1913f)
                lineTo(16.4413f, 19.427f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5582f, 19.427f)
                lineTo(8.5585f, 20.5447f)
                lineTo(7.9997f, 21.0449f)
                curveTo(7.3368f, 21.6383f, 6.4595f, 22.0f, 5.4995f, 22.0f)
                curveTo(3.4284f, 22.0f, 1.7495f, 20.321f, 1.7495f, 18.25f)
                curveTo(1.7495f, 17.29f, 2.1112f, 16.4127f, 2.7046f, 15.7498f)
                lineTo(3.2047f, 15.1909f)
                lineTo(4.3224f, 16.1913f)
                lineTo(7.5582f, 19.427f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 6.5f)
                curveTo(10.7574f, 6.5f, 9.75f, 7.5074f, 9.75f, 8.75f)
                curveTo(9.75f, 9.9926f, 10.7574f, 11.0f, 12.0f, 11.0f)
                curveTo(13.2426f, 11.0f, 14.25f, 9.9926f, 14.25f, 8.75f)
                curveTo(14.25f, 7.5074f, 13.2426f, 6.5f, 12.0f, 6.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.0f, 11.75f)
                curveTo(22.0f, 17.2728f, 17.5228f, 21.75f, 12.0f, 21.75f)
                curveTo(6.4771f, 21.75f, 2.0f, 17.2728f, 2.0f, 11.75f)
                curveTo(2.0f, 6.2271f, 6.4771f, 1.75f, 12.0f, 1.75f)
                curveTo(17.5228f, 1.75f, 22.0f, 6.2271f, 22.0f, 11.75f)
                close()
                moveTo(8.25f, 8.75f)
                curveTo(8.25f, 6.6789f, 9.9289f, 5.0f, 12.0f, 5.0f)
                curveTo(14.0711f, 5.0f, 15.75f, 6.6789f, 15.75f, 8.75f)
                curveTo(15.75f, 10.8211f, 14.0711f, 12.5f, 12.0f, 12.5f)
                curveTo(9.9289f, 12.5f, 8.25f, 10.8211f, 8.25f, 8.75f)
                close()
                moveTo(12.75f, 15.75f)
                curveTo(12.75f, 15.3358f, 12.4142f, 15.0f, 12.0f, 15.0f)
                curveTo(11.5858f, 15.0f, 11.25f, 15.3358f, 11.25f, 15.75f)
                verticalLineTo(17.75f)
                curveTo(11.25f, 18.1642f, 11.5858f, 18.5f, 12.0f, 18.5f)
                curveTo(12.4142f, 18.5f, 12.75f, 18.1642f, 12.75f, 17.75f)
                verticalLineTo(15.75f)
                close()
            }
        }
            .build()
        return _smartVacuumCleaner!!
    }

private var _smartVacuumCleaner: ImageVector? = null
