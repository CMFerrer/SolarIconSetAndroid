package com.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MedicineGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.2859f, 2.0f, 4.9289f, 3.4645f, 3.4644f)
                curveTo(4.6409f, 2.288f, 6.3933f, 2.0566f, 9.4809f, 2.0111f)
                verticalLineTo(4.0606f)
                curveTo(9.4809f, 4.6171f, 9.0046f, 5.0591f, 8.5204f, 5.3334f)
                curveTo(7.6057f, 5.8516f, 6.9619f, 7.0399f, 6.9619f, 8.091f)
                curveTo(6.9619f, 9.4822f, 8.0897f, 10.6099f, 9.4809f, 10.6099f)
                curveTo(10.8721f, 10.6099f, 11.9999f, 9.4822f, 11.9999f, 8.091f)
                curveTo(11.9999f, 9.4822f, 13.1277f, 10.6099f, 14.5189f, 10.6099f)
                curveTo(15.9101f, 10.6099f, 17.0379f, 9.4822f, 17.0379f, 8.091f)
                curveTo(17.0379f, 7.0399f, 16.3941f, 5.8516f, 15.4794f, 5.3334f)
                curveTo(14.9952f, 5.0591f, 14.5189f, 4.6171f, 14.5189f, 4.0606f)
                verticalLineTo(2.0111f)
                curveTo(17.6066f, 2.0566f, 19.3591f, 2.288f, 20.5355f, 3.4644f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.2859f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.071f, 20.5355f, 20.5355f)
                curveTo(19.3639f, 21.7071f, 17.621f, 21.9414f, 14.557f, 21.9883f)
                lineTo(14.557f, 19.9848f)
                curveTo(14.557f, 19.4283f, 15.0333f, 18.9863f, 15.5175f, 18.712f)
                curveTo(16.4322f, 18.1938f, 17.076f, 17.0055f, 17.076f, 15.9544f)
                curveTo(17.076f, 14.5632f, 15.9482f, 13.4354f, 14.557f, 13.4354f)
                curveTo(13.1658f, 13.4354f, 12.038f, 14.5632f, 12.038f, 15.9544f)
                curveTo(12.038f, 14.5632f, 10.9102f, 13.4354f, 9.519f, 13.4354f)
                curveTo(8.1278f, 13.4354f, 7.0f, 14.5632f, 7.0f, 15.9544f)
                curveTo(7.0f, 17.0055f, 7.6438f, 18.1938f, 8.5585f, 18.712f)
                curveTo(9.0427f, 18.9863f, 9.519f, 19.4283f, 9.519f, 19.9848f)
                verticalLineTo(21.9894f)
                curveTo(6.4077f, 21.9452f, 4.6457f, 21.7168f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.071f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
            }
        }
            .build()
        return _bones!!
    }

private var _bones: ImageVector? = null
