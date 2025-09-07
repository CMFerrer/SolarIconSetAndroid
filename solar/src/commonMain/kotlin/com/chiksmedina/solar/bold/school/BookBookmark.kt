package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

val SchoolGroup.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) {
            return _bookBookmark!!
        }
        _bookBookmark = Builder(
            name = "BookBookmark", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.271f, 2.1115f)
                curveTo(5.4613f, 2.2182f, 5.0326f, 2.4132f, 4.7272f, 2.7124f)
                curveTo(4.4218f, 3.0117f, 4.2227f, 3.4317f, 4.1138f, 4.225f)
                curveTo(4.0018f, 5.0416f, 4.0f, 6.1239f, 4.0f, 7.6757f)
                verticalLineTo(16.2442f)
                curveTo(4.3887f, 15.9781f, 4.8267f, 15.7756f, 5.299f, 15.6517f)
                curveTo(5.8272f, 15.513f, 6.443f, 15.5132f, 7.3456f, 15.5135f)
                lineTo(20.0f, 15.5135f)
                verticalLineTo(7.6757f)
                curveTo(20.0f, 6.1239f, 19.9982f, 5.0416f, 19.8862f, 4.225f)
                curveTo(19.7773f, 3.4317f, 19.5782f, 3.0117f, 19.2728f, 2.7124f)
                curveTo(18.9674f, 2.4132f, 18.5387f, 2.2182f, 17.729f, 2.1115f)
                curveTo(16.8955f, 2.0017f, 15.7908f, 2.0f, 14.2069f, 2.0f)
                horizontalLineTo(9.7931f)
                curveTo(8.2092f, 2.0f, 7.1045f, 2.0017f, 6.271f, 2.1115f)
                close()
                moveTo(6.7586f, 6.5946f)
                curveTo(6.7586f, 6.1468f, 7.1291f, 5.7838f, 7.5862f, 5.7838f)
                horizontalLineTo(16.4138f)
                curveTo(16.8709f, 5.7838f, 17.2414f, 6.1468f, 17.2414f, 6.5946f)
                curveTo(17.2414f, 7.0424f, 16.8709f, 7.4054f, 16.4138f, 7.4054f)
                horizontalLineTo(7.5862f)
                curveTo(7.1291f, 7.4054f, 6.7586f, 7.0424f, 6.7586f, 6.5946f)
                close()
                moveTo(7.5862f, 9.5676f)
                curveTo(7.1291f, 9.5676f, 6.7586f, 9.9306f, 6.7586f, 10.3784f)
                curveTo(6.7586f, 10.8262f, 7.1291f, 11.1892f, 7.5862f, 11.1892f)
                horizontalLineTo(13.1034f)
                curveTo(13.5605f, 11.1892f, 13.931f, 10.8262f, 13.931f, 10.3784f)
                curveTo(13.931f, 9.9306f, 13.5605f, 9.5676f, 13.1034f, 9.5676f)
                horizontalLineTo(7.5862f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6896f, 17.1351f)
                horizontalLineTo(7.4734f)
                curveTo(6.3939f, 17.1351f, 6.0166f, 17.1421f, 5.7274f, 17.218f)
                curveTo(4.9337f, 17.4264f, 4.3009f, 18.0044f, 4.0295f, 18.7558f)
                curveTo(4.0463f, 19.1382f, 4.0726f, 19.4746f, 4.1138f, 19.775f)
                curveTo(4.2227f, 20.5683f, 4.4218f, 20.9884f, 4.7272f, 21.2876f)
                curveTo(5.0326f, 21.5868f, 5.4613f, 21.7818f, 6.271f, 21.8885f)
                curveTo(7.1045f, 21.9983f, 8.2092f, 22.0f, 9.7931f, 22.0f)
                horizontalLineTo(14.2069f)
                curveTo(15.7908f, 22.0f, 16.8955f, 21.9983f, 17.729f, 21.8885f)
                curveTo(18.5387f, 21.7818f, 18.9674f, 21.5868f, 19.2728f, 21.2876f)
                curveTo(19.5782f, 20.9884f, 19.7773f, 20.5683f, 19.8862f, 19.775f)
                curveTo(19.9776f, 19.1088f, 19.9956f, 18.2657f, 19.9991f, 17.1351f)
                horizontalLineTo(13.1034f)
                verticalLineTo(20.1417f)
                curveTo(13.1034f, 20.4397f, 13.1034f, 20.5886f, 12.9988f, 20.6488f)
                curveTo(12.8941f, 20.709f, 12.751f, 20.6424f, 12.4647f, 20.5092f)
                lineTo(11.0939f, 19.8713f)
                curveTo(10.9971f, 19.8262f, 10.9486f, 19.8037f, 10.8966f, 19.8037f)
                curveTo(10.8445f, 19.8037f, 10.796f, 19.8262f, 10.6992f, 19.8713f)
                lineTo(9.3284f, 20.5092f)
                curveTo(9.0421f, 20.6424f, 8.899f, 20.709f, 8.7943f, 20.6488f)
                curveTo(8.6896f, 20.5886f, 8.6896f, 20.4397f, 8.6896f, 20.1417f)
                verticalLineTo(17.1351f)
                close()
            }
        }
            .build()
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
