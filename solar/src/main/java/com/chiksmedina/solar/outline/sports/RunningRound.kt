package com.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SportsGroup

val SportsGroup.RunningRound: ImageVector
    get() {
        if (_runningRound != null) {
            return _runningRound!!
        }
        _runningRound = Builder(
            name = "RunningRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.5f, 2.75f)
                curveTo(17.5335f, 2.75f, 16.75f, 3.5335f, 16.75f, 4.5f)
                curveTo(16.75f, 5.4665f, 17.5335f, 6.25f, 18.5f, 6.25f)
                curveTo(19.4665f, 6.25f, 20.25f, 5.4665f, 20.25f, 4.5f)
                curveTo(20.25f, 3.5335f, 19.4665f, 2.75f, 18.5f, 2.75f)
                close()
                moveTo(15.25f, 4.5f)
                curveTo(15.25f, 2.7051f, 16.7051f, 1.25f, 18.5f, 1.25f)
                curveTo(20.2949f, 1.25f, 21.75f, 2.7051f, 21.75f, 4.5f)
                curveTo(21.75f, 6.2949f, 20.2949f, 7.75f, 18.5f, 7.75f)
                curveTo(16.7051f, 7.75f, 15.25f, 6.2949f, 15.25f, 4.5f)
                close()
                moveTo(8.9723f, 5.8101f)
                curveTo(9.8749f, 5.4119f, 10.8988f, 5.3894f, 11.818f, 5.7475f)
                curveTo(14.3856f, 6.7479f, 15.0063f, 10.0988f, 12.9673f, 11.9524f)
                lineTo(11.9272f, 12.898f)
                curveTo(11.8873f, 12.9342f, 11.8756f, 12.9449f, 11.868f, 12.9521f)
                curveTo(11.3146f, 13.4759f, 11.3545f, 14.3687f, 11.9525f, 14.841f)
                curveTo(11.9608f, 14.8475f, 11.9735f, 14.8572f, 12.0164f, 14.8897f)
                lineTo(12.0198f, 14.8923f)
                curveTo(12.0784f, 14.9367f, 12.1124f, 14.9624f, 12.1449f, 14.9876f)
                curveTo(14.0177f, 16.4378f, 15.1245f, 18.6648f, 15.1496f, 21.0334f)
                curveTo(15.15f, 21.0752f, 15.15f, 21.1188f, 15.15f, 21.195f)
                verticalLineTo(22.0f)
                curveTo(15.15f, 22.4142f, 14.8142f, 22.75f, 14.4f, 22.75f)
                curveTo(13.9858f, 22.75f, 13.65f, 22.4142f, 13.65f, 22.0f)
                verticalLineTo(21.195f)
                curveTo(13.65f, 21.1156f, 13.65f, 21.0813f, 13.6497f, 21.0492f)
                curveTo(13.6295f, 19.1391f, 12.7369f, 17.3431f, 11.2265f, 16.1736f)
                curveTo(11.2012f, 16.1539f, 11.1739f, 16.1332f, 11.1106f, 16.0853f)
                lineTo(11.1042f, 16.0804f)
                curveTo(11.0707f, 16.0551f, 11.0447f, 16.0354f, 11.0229f, 16.0182f)
                curveTo(9.7073f, 14.9792f, 9.6194f, 13.0151f, 10.8368f, 11.8628f)
                curveTo(10.8571f, 11.8436f, 10.881f, 11.8218f, 10.9123f, 11.7934f)
                lineTo(10.9182f, 11.788f)
                lineTo(11.9583f, 10.8425f)
                curveTo(13.1733f, 9.738f, 12.8034f, 7.7413f, 11.2734f, 7.1452f)
                curveTo(10.7257f, 6.9318f, 10.1156f, 6.9452f, 9.5778f, 7.1825f)
                lineTo(9.0561f, 7.4127f)
                curveTo(8.5108f, 7.6532f, 8.259f, 7.7645f, 8.0142f, 7.886f)
                curveTo(7.6014f, 8.0909f, 7.2005f, 8.3189f, 6.8134f, 8.569f)
                curveTo(6.5838f, 8.7173f, 6.3595f, 8.8769f, 5.874f, 9.2226f)
                lineTo(4.4351f, 10.2473f)
                curveTo(4.0977f, 10.4876f, 3.6293f, 10.4088f, 3.3891f, 10.0714f)
                curveTo(3.1488f, 9.734f, 3.2275f, 9.2657f, 3.5649f, 9.0254f)
                lineTo(5.0209f, 7.9886f)
                curveTo(5.4851f, 7.658f, 5.7381f, 7.4779f, 5.9995f, 7.3091f)
                curveTo(6.4339f, 7.0284f, 6.8839f, 6.7724f, 7.3473f, 6.5424f)
                curveTo(7.626f, 6.4041f, 7.9101f, 6.2787f, 8.4315f, 6.0487f)
                lineTo(8.9723f, 5.8101f)
                close()
                moveTo(15.2724f, 11.8181f)
                curveTo(15.3729f, 11.4163f, 15.7801f, 11.1719f, 16.1819f, 11.2724f)
                curveTo(17.3756f, 11.5708f, 18.6244f, 11.5708f, 19.8181f, 11.2724f)
                curveTo(20.2199f, 11.1719f, 20.6271f, 11.4163f, 20.7276f, 11.8181f)
                curveTo(20.8281f, 12.2199f, 20.5837f, 12.6271f, 20.1819f, 12.7276f)
                curveTo(18.7493f, 13.0857f, 17.2507f, 13.0857f, 15.8181f, 12.7276f)
                curveTo(15.4163f, 12.6271f, 15.1719f, 12.2199f, 15.2724f, 11.8181f)
                close()
                moveTo(9.4801f, 16.4238f)
                curveTo(9.7984f, 16.689f, 9.8413f, 17.1619f, 9.5762f, 17.4801f)
                lineTo(9.3168f, 17.7914f)
                curveTo(7.7546f, 19.6661f, 5.4403f, 20.75f, 3.0f, 20.75f)
                curveTo(2.5858f, 20.75f, 2.25f, 20.4142f, 2.25f, 20.0f)
                curveTo(2.25f, 19.5858f, 2.5858f, 19.25f, 3.0f, 19.25f)
                curveTo(4.9952f, 19.25f, 6.8872f, 18.3638f, 8.1645f, 16.8311f)
                lineTo(8.4238f, 16.5199f)
                curveTo(8.689f, 16.2017f, 9.1619f, 16.1587f, 9.4801f, 16.4238f)
                close()
            }
        }
            .build()
        return _runningRound!!
    }

private var _runningRound: ImageVector? = null
