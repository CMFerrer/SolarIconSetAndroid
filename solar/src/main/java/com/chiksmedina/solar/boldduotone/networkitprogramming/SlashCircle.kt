package com.chiksmedina.solar.boldduotone.networkitprogramming

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.SlashCircle: ImageVector
    get() {
        if (_slashCircle != null) {
            return _slashCircle!!
        }
        _slashCircle = Builder(
            name = "SlashCircle", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0189f, 7.3645f)
                curveTo(14.1261f, 6.9644f, 13.8886f, 6.5531f, 13.4885f, 6.4459f)
                curveTo(13.0884f, 6.3387f, 12.6772f, 6.5761f, 12.57f, 6.9762f)
                lineTo(9.9818f, 16.6355f)
                curveTo(9.8746f, 17.0356f, 10.112f, 17.4468f, 10.5121f, 17.5541f)
                curveTo(10.9122f, 17.6613f, 11.3235f, 17.4238f, 11.4307f, 17.0237f)
                lineTo(14.0189f, 7.3645f)
                close()
            }
        }
            .build()
        return _slashCircle!!
    }

private var _slashCircle: ImageVector? = null
