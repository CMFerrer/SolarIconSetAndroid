package com.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.EssentionalUiGroup

public val EssentionalUiGroup.ScissorsSquare: ImageVector
    get() {
        if (_scissorsSquare != null) {
            return _scissorsSquare!!
        }
        _scissorsSquare = Builder(name = "ScissorsSquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.379f, 5.3528f)
                curveTo(16.0216f, 5.1435f, 15.5622f, 5.2635f, 15.3528f, 5.621f)
                lineTo(12.0f, 11.3458f)
                lineTo(8.6472f, 5.621f)
                curveTo(8.4378f, 5.2635f, 7.9784f, 5.1435f, 7.621f, 5.3528f)
                curveTo(7.2635f, 5.5622f, 7.1435f, 6.0216f, 7.3528f, 6.379f)
                lineTo(11.1308f, 12.8299f)
                lineTo(10.0195f, 14.7275f)
                curveTo(9.5391f, 14.0702f, 8.7478f, 13.65f, 7.875f, 13.65f)
                curveTo(6.4544f, 13.65f, 5.25f, 14.7631f, 5.25f, 16.2f)
                curveTo(5.25f, 17.6369f, 6.4544f, 18.75f, 7.875f, 18.75f)
                curveTo(8.8673f, 18.75f, 9.7542f, 18.2069f, 10.1987f, 17.3896f)
                lineTo(12.0f, 14.314f)
                lineTo(13.8013f, 17.3896f)
                curveTo(14.2458f, 18.2069f, 15.1327f, 18.75f, 16.125f, 18.75f)
                curveTo(17.5456f, 18.75f, 18.75f, 17.6369f, 18.75f, 16.2f)
                curveTo(18.75f, 14.7631f, 17.5456f, 13.65f, 16.125f, 13.65f)
                curveTo(15.2522f, 13.65f, 14.4609f, 14.0702f, 13.9805f, 14.7275f)
                lineTo(12.8692f, 12.8299f)
                lineTo(16.6472f, 6.379f)
                curveTo(16.8565f, 6.0216f, 16.7365f, 5.5622f, 16.379f, 5.3528f)
                close()
                moveTo(7.875f, 15.15f)
                curveTo(8.5255f, 15.15f, 9.0f, 15.6487f, 9.0f, 16.2f)
                curveTo(9.0f, 16.7513f, 8.5255f, 17.25f, 7.875f, 17.25f)
                curveTo(7.2245f, 17.25f, 6.75f, 16.7513f, 6.75f, 16.2f)
                curveTo(6.75f, 15.6487f, 7.2245f, 15.15f, 7.875f, 15.15f)
                close()
                moveTo(16.125f, 15.15f)
                curveTo(15.4745f, 15.15f, 15.0f, 15.6487f, 15.0f, 16.2f)
                curveTo(15.0f, 16.7513f, 15.4745f, 17.25f, 16.125f, 17.25f)
                curveTo(16.7755f, 17.25f, 17.25f, 16.7513f, 17.25f, 16.2f)
                curveTo(17.25f, 15.6487f, 16.7755f, 15.15f, 16.125f, 15.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0574f, 1.25f)
                horizontalLineTo(11.9426f)
                curveTo(9.6342f, 1.25f, 7.8252f, 1.25f, 6.4137f, 1.4397f)
                curveTo(4.969f, 1.634f, 3.8289f, 2.0393f, 2.9341f, 2.9341f)
                curveTo(2.0393f, 3.8289f, 1.634f, 4.969f, 1.4397f, 6.4137f)
                curveTo(1.25f, 7.8252f, 1.25f, 9.6342f, 1.25f, 11.9426f)
                verticalLineTo(12.0574f)
                curveTo(1.25f, 14.3658f, 1.25f, 16.1748f, 1.4397f, 17.5863f)
                curveTo(1.634f, 19.031f, 2.0393f, 20.1711f, 2.9341f, 21.0659f)
                curveTo(3.8289f, 21.9607f, 4.969f, 22.366f, 6.4137f, 22.5603f)
                curveTo(7.8252f, 22.75f, 9.6342f, 22.75f, 11.9426f, 22.75f)
                horizontalLineTo(12.0574f)
                curveTo(14.3658f, 22.75f, 16.1748f, 22.75f, 17.5863f, 22.5603f)
                curveTo(19.031f, 22.366f, 20.1711f, 21.9607f, 21.0659f, 21.0659f)
                curveTo(21.9607f, 20.1711f, 22.366f, 19.031f, 22.5603f, 17.5863f)
                curveTo(22.75f, 16.1748f, 22.75f, 14.3658f, 22.75f, 12.0574f)
                verticalLineTo(11.9426f)
                curveTo(22.75f, 9.6342f, 22.75f, 7.8252f, 22.5603f, 6.4137f)
                curveTo(22.366f, 4.969f, 21.9607f, 3.8289f, 21.0659f, 2.9341f)
                curveTo(20.1711f, 2.0393f, 19.031f, 1.634f, 17.5863f, 1.4397f)
                curveTo(16.1748f, 1.25f, 14.3658f, 1.25f, 12.0574f, 1.25f)
                close()
                moveTo(3.9948f, 3.9948f)
                curveTo(4.5644f, 3.4251f, 5.3352f, 3.0982f, 6.6136f, 2.9264f)
                curveTo(7.9136f, 2.7516f, 9.6218f, 2.75f, 12.0f, 2.75f)
                curveTo(14.3782f, 2.75f, 16.0864f, 2.7516f, 17.3864f, 2.9264f)
                curveTo(18.6648f, 3.0982f, 19.4355f, 3.4251f, 20.0052f, 3.9948f)
                curveTo(20.5749f, 4.5644f, 20.9018f, 5.3352f, 21.0736f, 6.6136f)
                curveTo(21.2484f, 7.9136f, 21.25f, 9.6218f, 21.25f, 12.0f)
                curveTo(21.25f, 14.3782f, 21.2484f, 16.0864f, 21.0736f, 17.3864f)
                curveTo(20.9018f, 18.6648f, 20.5749f, 19.4355f, 20.0052f, 20.0052f)
                curveTo(19.4355f, 20.5749f, 18.6648f, 20.9018f, 17.3864f, 21.0736f)
                curveTo(16.0864f, 21.2484f, 14.3782f, 21.25f, 12.0f, 21.25f)
                curveTo(9.6218f, 21.25f, 7.9136f, 21.2484f, 6.6136f, 21.0736f)
                curveTo(5.3352f, 20.9018f, 4.5644f, 20.5749f, 3.9948f, 20.0052f)
                curveTo(3.4251f, 19.4355f, 3.0982f, 18.6648f, 2.9264f, 17.3864f)
                curveTo(2.7516f, 16.0864f, 2.75f, 14.3782f, 2.75f, 12.0f)
                curveTo(2.75f, 9.6218f, 2.7516f, 7.9136f, 2.9264f, 6.6136f)
                curveTo(3.0982f, 5.3352f, 3.4251f, 4.5644f, 3.9948f, 3.9948f)
                close()
            }
        }
        .build()
        return _scissorsSquare!!
    }

private var _scissorsSquare: ImageVector? = null
