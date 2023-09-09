package com.chiksmedina.solar.linear.essentionalui

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
import com.chiksmedina.solar.linear.EssentionalUiGroup

public val EssentionalUiGroup.GhostSmile: ImageVector
    get() {
        if (_ghostSmile != null) {
            return _ghostSmile!!
        }
        _ghostSmile = Builder(name = "GhostSmile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveTo(9.8504f, 15.6303f, 10.8846f, 16.0f, 12.0f, 16.0f)
                curveTo(13.1154f, 16.0f, 14.1496f, 15.6303f, 15.0f, 15.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.5f, 0.0f, true, false, -2.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.723f)
                verticalLineTo(12.3006f)
                curveTo(22.0f, 6.6117f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.6117f, 2.0f, 12.3006f)
                verticalLineTo(19.723f)
                curveTo(2.0f, 21.0453f, 3.351f, 21.9054f, 4.4992f, 21.314f)
                curveTo(5.4273f, 20.836f, 6.5328f, 20.9069f, 7.3961f, 21.4998f)
                curveTo(8.3674f, 22.1667f, 9.6326f, 22.1667f, 10.6039f, 21.4998f)
                lineTo(10.9565f, 21.2576f)
                curveTo(11.5884f, 20.8237f, 12.4116f, 20.8237f, 13.0435f, 21.2576f)
                lineTo(13.3961f, 21.4998f)
                curveTo(14.3674f, 22.1667f, 15.6326f, 22.1667f, 16.6039f, 21.4998f)
                curveTo(17.4672f, 20.9069f, 18.5727f, 20.836f, 19.5008f, 21.314f)
                curveTo(20.649f, 21.9054f, 22.0f, 21.0453f, 22.0f, 19.723f)
                close()
            }
        }
        .build()
        return _ghostSmile!!
    }

private var _ghostSmile: ImageVector? = null
