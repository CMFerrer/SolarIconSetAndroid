package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

public val EssentionalUiGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.6539f, 1.6326f)
                curveTo(6.4509f, 1.2715f, 5.9936f, 1.1434f, 5.6326f, 1.3464f)
                curveTo(5.2715f, 1.5494f, 5.1434f, 2.0066f, 5.3464f, 2.3677f)
                lineTo(15.7041f, 20.7901f)
                curveTo(16.3395f, 21.9577f, 17.5773f, 22.7501f, 19.0001f, 22.7501f)
                curveTo(21.0712f, 22.7501f, 22.7501f, 21.0712f, 22.7501f, 19.0001f)
                curveTo(22.7501f, 16.9291f, 21.0712f, 15.2501f, 19.0001f, 15.2501f)
                curveTo(17.4674f, 15.2501f, 16.1495f, 16.1697f, 15.5679f, 17.4871f)
                lineTo(6.6539f, 1.6326f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.346f, 1.6326f)
                curveTo(17.549f, 1.2715f, 18.0063f, 1.1434f, 18.3673f, 1.3464f)
                curveTo(18.7284f, 1.5494f, 18.8565f, 2.0066f, 18.6535f, 2.3677f)
                lineTo(8.2958f, 20.7901f)
                curveTo(7.6604f, 21.9577f, 6.4226f, 22.7501f, 4.9998f, 22.7501f)
                curveTo(2.9287f, 22.7501f, 1.2498f, 21.0712f, 1.2498f, 19.0001f)
                curveTo(1.2498f, 16.9291f, 2.9287f, 15.2501f, 4.9998f, 15.2501f)
                curveTo(6.5325f, 15.2501f, 7.8504f, 16.1697f, 8.432f, 17.4871f)
                lineTo(17.346f, 1.6326f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
