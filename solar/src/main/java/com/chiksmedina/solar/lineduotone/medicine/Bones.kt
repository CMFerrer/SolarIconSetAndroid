package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

public val MedicineGroup.Bones: ImageVector
    get() {
        if (_bones != null) {
            return _bones!!
        }
        _bones = Builder(name = "Bones", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.4809f, 2.0454f)
                verticalLineTo(4.0606f)
                curveTo(9.4809f, 4.6171f, 9.0046f, 5.0591f, 8.5204f, 5.3334f)
                curveTo(7.6057f, 5.8516f, 6.9619f, 7.0399f, 6.9619f, 8.091f)
                curveTo(6.9619f, 9.4822f, 8.0897f, 10.61f, 9.4809f, 10.61f)
                curveTo(10.8721f, 10.61f, 11.9999f, 9.4822f, 11.9999f, 8.091f)
                curveTo(11.9999f, 9.4822f, 13.1277f, 10.61f, 14.5189f, 10.61f)
                curveTo(15.9101f, 10.61f, 17.0379f, 9.4822f, 17.0379f, 8.091f)
                curveTo(17.0379f, 7.0399f, 16.3941f, 5.8516f, 15.4794f, 5.3334f)
                curveTo(14.9952f, 5.0591f, 14.5189f, 4.6171f, 14.5189f, 4.0606f)
                lineTo(14.5189f, 2.0454f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.519f, 22.0f)
                verticalLineTo(19.9848f)
                curveTo(9.519f, 19.4283f, 9.0427f, 18.9863f, 8.5585f, 18.712f)
                curveTo(7.6438f, 18.1938f, 7.0f, 17.0055f, 7.0f, 15.9544f)
                curveTo(7.0f, 14.5632f, 8.1278f, 13.4354f, 9.519f, 13.4354f)
                curveTo(10.9102f, 13.4354f, 12.038f, 14.5632f, 12.038f, 15.9544f)
                curveTo(12.038f, 14.5632f, 13.1658f, 13.4354f, 14.557f, 13.4354f)
                curveTo(15.9482f, 13.4354f, 17.076f, 14.5632f, 17.076f, 15.9544f)
                curveTo(17.076f, 17.0055f, 16.4322f, 18.1938f, 15.5175f, 18.712f)
                curveTo(15.0333f, 18.9863f, 14.557f, 19.4283f, 14.557f, 19.9848f)
                lineTo(14.557f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        }
        .build()
        return _bones!!
    }

private var _bones: ImageVector? = null
