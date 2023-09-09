package com.chiksmedina.solar.boldduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.MedicineGroup

public val MedicineGroup.Virus: ImageVector
    get() {
        if (_virus != null) {
            return _virus!!
        }
        _virus = Builder(name = "Virus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.9998f, 12.0565f)
                curveTo(19.031f, 15.9224f, 15.9224f, 19.031f, 12.0565f, 18.9998f)
                curveTo(8.1906f, 18.9686f, 5.0314f, 15.8094f, 5.0002f, 11.9435f)
                curveTo(4.969f, 8.0777f, 8.0777f, 4.969f, 11.9435f, 5.0002f)
                curveTo(15.8094f, 5.0314f, 18.9686f, 8.1906f, 18.9998f, 12.0565f)
                close()
                moveTo(14.5f, 10.25f)
                curveTo(12.9812f, 10.25f, 11.75f, 11.4812f, 11.75f, 13.0f)
                curveTo(11.75f, 14.5188f, 12.9812f, 15.75f, 14.5f, 15.75f)
                curveTo(16.0188f, 15.75f, 17.25f, 14.5188f, 17.25f, 13.0f)
                curveTo(17.25f, 11.4812f, 16.0188f, 10.25f, 14.5f, 10.25f)
                close()
                moveTo(8.25f, 9.0f)
                curveTo(8.25f, 8.0335f, 9.0335f, 7.25f, 10.0f, 7.25f)
                curveTo(10.9665f, 7.25f, 11.75f, 8.0335f, 11.75f, 9.0f)
                curveTo(11.75f, 9.9665f, 10.9665f, 10.75f, 10.0f, 10.75f)
                curveTo(9.0335f, 10.75f, 8.25f, 9.9665f, 8.25f, 9.0f)
                close()
                moveTo(9.0f, 14.0f)
                curveTo(9.5523f, 14.0f, 10.0f, 13.5523f, 10.0f, 13.0f)
                curveTo(10.0f, 12.4477f, 9.5523f, 12.0f, 9.0f, 12.0f)
                curveTo(8.4477f, 12.0f, 8.0f, 12.4477f, 8.0f, 13.0f)
                curveTo(8.0f, 13.5523f, 8.4477f, 14.0f, 9.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.25f, 13.0f)
                curveTo(13.25f, 12.3096f, 13.8096f, 11.75f, 14.5f, 11.75f)
                curveTo(15.1904f, 11.75f, 15.75f, 12.3096f, 15.75f, 13.0f)
                curveTo(15.75f, 13.6904f, 15.1904f, 14.25f, 14.5f, 14.25f)
                curveTo(13.8096f, 14.25f, 13.25f, 13.6904f, 13.25f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 4.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0508f, 4.8885f)
                lineTo(16.4197f, 6.5197f)
                curveTo(16.3968f, 6.5426f, 16.3757f, 6.5665f, 16.3564f, 6.5914f)
                curveTo(16.7424f, 6.9048f, 17.0952f, 7.2576f, 17.4086f, 7.6436f)
                curveTo(17.4335f, 7.6243f, 17.4575f, 7.6032f, 17.4803f, 7.5804f)
                lineTo(19.1115f, 5.9492f)
                curveTo(18.5953f, 5.8112f, 18.1889f, 5.4047f, 18.0508f, 4.8885f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5498f, 19.5498f)
                moveToRelative(-1.5f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, -0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, -0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.6306f, 18.5498f)
                lineTo(9.8781f, 19.25f)
                curveTo(10.1866f, 20.1229f, 11.019f, 20.7501f, 11.9999f, 20.7501f)
                curveTo(12.9807f, 20.7501f, 13.8132f, 20.1229f, 14.1217f, 19.25f)
                lineTo(14.3384f, 18.6368f)
                curveTo(13.6242f, 18.8782f, 12.8566f, 19.0063f, 12.0564f, 18.9998f)
                curveTo(11.2049f, 18.993f, 10.3877f, 18.8343f, 9.6306f, 18.5498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.1128f, 10.6305f)
                curveTo(4.9257f, 10.5466f, 4.7183f, 10.5f, 4.5f, 10.5f)
                curveTo(3.6716f, 10.5f, 3.0f, 11.1716f, 3.0f, 12.0f)
                curveTo(3.0f, 12.8284f, 3.6716f, 13.5f, 4.5f, 13.5f)
                curveTo(4.734f, 13.5f, 4.9555f, 13.4464f, 5.1529f, 13.3508f)
                curveTo(5.0566f, 12.8958f, 5.0041f, 12.4252f, 5.0002f, 11.9435f)
                curveTo(4.9966f, 11.4944f, 5.0354f, 11.0554f, 5.1128f, 10.6305f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.8633f, 13.4939f)
                curveTo(18.9566f, 13.0304f, 19.0037f, 12.5496f, 18.9997f, 12.0565f)
                curveTo(18.9954f, 11.526f, 18.9322f, 11.0088f, 18.8164f, 10.5111f)
                curveTo(18.8766f, 10.5038f, 18.9378f, 10.5f, 18.9999f, 10.5f)
                curveTo(19.8284f, 10.5f, 20.4999f, 11.1716f, 20.4999f, 12.0f)
                curveTo(20.4999f, 12.8284f, 19.8284f, 13.5f, 18.9999f, 13.5f)
                curveTo(18.9539f, 13.5f, 18.9083f, 13.4979f, 18.8633f, 13.4939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.3508f, 5.1529f)
                curveTo(13.4464f, 4.9555f, 13.5f, 4.734f, 13.5f, 4.5f)
                curveTo(13.5f, 3.6716f, 12.8284f, 3.0f, 12.0f, 3.0f)
                curveTo(11.1716f, 3.0f, 10.5f, 3.6716f, 10.5f, 4.5f)
                curveTo(10.5f, 4.7183f, 10.5466f, 4.9257f, 10.6305f, 5.1128f)
                curveTo(11.0554f, 5.0354f, 11.4944f, 4.9966f, 11.9435f, 5.0002f)
                curveTo(12.4252f, 5.0041f, 12.8958f, 5.0566f, 13.3508f, 5.1529f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.1006f, 19.1612f)
                lineTo(15.8486f, 17.9092f)
                curveTo(16.2737f, 17.6358f, 16.6663f, 17.3168f, 17.0197f, 16.959f)
                lineTo(18.1613f, 18.1006f)
                curveTo(17.6451f, 18.2386f, 17.2387f, 18.6451f, 17.1006f, 19.1612f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                moveToRelative(2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.781f, 5.8418f)
                curveTo(5.2575f, 5.6395f, 5.6393f, 5.2576f, 5.8417f, 4.7811f)
                lineTo(7.5303f, 6.4697f)
                curveTo(7.5435f, 6.4829f, 7.5561f, 6.4965f, 7.5681f, 6.5104f)
                curveTo(7.1781f, 6.8235f, 6.8233f, 7.1782f, 6.5103f, 7.5682f)
                curveTo(6.4964f, 7.5562f, 6.4828f, 7.5436f, 6.4696f, 7.5304f)
                lineTo(4.781f, 5.8418f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                moveToRelative(2.0f, -0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, -0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, -0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8157f, 18.1733f)
                lineTo(7.0849f, 16.9041f)
                curveTo(7.4403f, 17.2601f, 7.8328f, 17.5791f, 8.256f, 17.8543f)
                lineTo(6.8563f, 19.254f)
                curveTo(6.6628f, 18.7729f, 6.2876f, 18.3843f, 5.8157f, 18.1733f)
                close()
            }
        }
        .build()
        return _virus!!
    }

private var _virus: ImageVector? = null
