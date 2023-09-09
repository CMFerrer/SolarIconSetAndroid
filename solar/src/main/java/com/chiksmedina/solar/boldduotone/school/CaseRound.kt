package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.SchoolGroup

public val SchoolGroup.CaseRound: ImageVector
    get() {
        if (_caseRound != null) {
            return _caseRound!!
        }
        _caseRound = Builder(name = "CaseRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.1923f, 6.0f)
                horizontalLineTo(6.8077f)
                curveTo(5.1203f, 6.0f, 4.2766f, 6.0f, 3.6327f, 6.3297f)
                curveTo(3.0724f, 6.6166f, 2.6166f, 7.0724f, 2.3297f, 7.6327f)
                curveTo(2.0f, 8.2766f, 2.0f, 9.1203f, 2.0f, 10.8077f)
                curveTo(2.0f, 11.2366f, 2.0f, 11.4511f, 2.0734f, 11.6319f)
                curveTo(2.1374f, 11.7898f, 2.2408f, 11.9288f, 2.3736f, 12.0355f)
                curveTo(2.5257f, 12.1577f, 2.7312f, 12.2194f, 3.1421f, 12.3426f)
                lineTo(8.5f, 13.95f)
                verticalLineTo(15.1627f)
                curveTo(8.5f, 15.9283f, 8.9594f, 16.6341f, 9.6868f, 16.9296f)
                lineTo(10.2469f, 17.1572f)
                curveTo(11.3719f, 17.6143f, 12.6281f, 17.6143f, 13.7531f, 17.1572f)
                lineTo(14.3132f, 16.9296f)
                curveTo(15.0406f, 16.6341f, 15.5f, 15.9283f, 15.5f, 15.1627f)
                verticalLineTo(13.95f)
                lineTo(20.8579f, 12.3426f)
                curveTo(21.2688f, 12.2194f, 21.4743f, 12.1577f, 21.6264f, 12.0355f)
                curveTo(21.7592f, 11.9288f, 21.8626f, 11.7898f, 21.9266f, 11.6319f)
                curveTo(22.0f, 11.4511f, 22.0f, 11.2366f, 22.0f, 10.8077f)
                curveTo(22.0f, 9.1203f, 22.0f, 8.2766f, 21.6703f, 7.6327f)
                curveTo(21.3834f, 7.0724f, 20.9276f, 6.6166f, 20.3673f, 6.3297f)
                curveTo(19.7234f, 6.0f, 18.8797f, 6.0f, 17.1923f, 6.0f)
                close()
                moveTo(13.6f, 13.0f)
                horizontalLineTo(10.4f)
                curveTo(10.1791f, 13.0f, 10.0f, 13.1819f, 10.0f, 13.4063f)
                verticalLineTo(15.1627f)
                curveTo(10.0f, 15.3288f, 10.0996f, 15.4782f, 10.2514f, 15.54f)
                lineTo(10.8116f, 15.7675f)
                curveTo(11.5745f, 16.0775f, 12.4255f, 16.0775f, 13.1885f, 15.7675f)
                lineTo(13.7486f, 15.54f)
                curveTo(13.9004f, 15.4782f, 14.0f, 15.3288f, 14.0f, 15.1627f)
                verticalLineTo(13.4063f)
                curveTo(14.0f, 13.1819f, 13.8209f, 13.0f, 13.6f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9579f, 12.3124f)
                curveTo(20.9469f, 12.3158f, 20.9356f, 12.3192f, 20.9242f, 12.3226f)
                lineTo(15.5f, 13.9499f)
                verticalLineTo(15.1626f)
                curveTo(15.5f, 15.9282f, 15.0406f, 16.634f, 14.3132f, 16.9295f)
                lineTo(13.7531f, 17.1571f)
                curveTo(12.6281f, 17.6141f, 11.3719f, 17.6141f, 10.2469f, 17.1571f)
                lineTo(9.6868f, 16.9295f)
                curveTo(8.9594f, 16.634f, 8.5f, 15.9282f, 8.5f, 15.1626f)
                verticalLineTo(13.9499f)
                lineTo(3.0f, 12.2998f)
                curveTo(3.0009f, 15.9751f, 3.0349f, 19.6878f, 4.318f, 20.8284f)
                curveTo(5.636f, 21.9999f, 7.7573f, 21.9999f, 12.0f, 21.9999f)
                curveTo(16.2426f, 21.9999f, 18.3639f, 21.9999f, 19.682f, 20.8284f)
                curveTo(20.9651f, 19.6878f, 20.9991f, 15.9751f, 21.0f, 12.2998f)
                lineTo(20.9579f, 12.3124f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1709f, 4.0f)
                curveTo(9.5827f, 2.8348f, 10.694f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.3064f, 2.0f, 14.4177f, 2.8348f, 14.8295f, 4.0f)
            }
        }
        .build()
        return _caseRound!!
    }

private var _caseRound: ImageVector? = null
