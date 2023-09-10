package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.MedicineGroup

val MedicineGroup.Bones: ImageVector
    get() {
        if (_bones != null) {
            return _bones!!
        }
        _bones = Builder(
            name = "Bones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
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
                pathFillType = NonZero
            ) {
                moveTo(9.4809f, 10.6101f)
                curveTo(10.8721f, 10.6101f, 11.9999f, 9.4823f, 11.9999f, 8.0911f)
                curveTo(11.9999f, 9.4823f, 13.1277f, 10.6101f, 14.5189f, 10.6101f)
                curveTo(15.9101f, 10.6101f, 17.0379f, 9.4823f, 17.0379f, 8.0911f)
                curveTo(17.0379f, 7.04f, 16.3941f, 5.8517f, 15.4794f, 5.3335f)
                curveTo(14.9952f, 5.0592f, 14.5189f, 4.6172f, 14.5189f, 4.0607f)
                verticalLineTo(2.0112f)
                lineTo(9.4809f, 2.0112f)
                verticalLineTo(4.0607f)
                curveTo(9.4809f, 4.6172f, 9.0046f, 5.0592f, 8.5204f, 5.3335f)
                curveTo(7.6057f, 5.8517f, 6.9619f, 7.04f, 6.9619f, 8.0911f)
                curveTo(6.9619f, 9.4823f, 8.0897f, 10.6101f, 9.4809f, 10.6101f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.557f, 21.9884f)
                lineTo(14.557f, 19.9849f)
                curveTo(14.557f, 19.4284f, 15.0333f, 18.9864f, 15.5175f, 18.7121f)
                curveTo(16.4322f, 18.1939f, 17.076f, 17.0056f, 17.076f, 15.9545f)
                curveTo(17.076f, 14.5633f, 15.9482f, 13.4355f, 14.557f, 13.4355f)
                curveTo(13.1658f, 13.4355f, 12.038f, 14.5633f, 12.038f, 15.9545f)
                curveTo(12.038f, 14.5633f, 10.9102f, 13.4355f, 9.519f, 13.4355f)
                curveTo(8.1278f, 13.4355f, 7.0f, 14.5633f, 7.0f, 15.9545f)
                curveTo(7.0f, 17.0056f, 7.6438f, 18.1939f, 8.5585f, 18.7121f)
                curveTo(9.0427f, 18.9864f, 9.519f, 19.4284f, 9.519f, 19.9849f)
                verticalLineTo(21.9895f)
                lineTo(14.557f, 21.9884f)
                close()
            }
        }
            .build()
        return _bones!!
    }

private var _bones: ImageVector? = null
