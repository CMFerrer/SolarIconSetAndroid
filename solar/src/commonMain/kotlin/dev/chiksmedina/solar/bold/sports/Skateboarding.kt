package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Skateboarding: ImageVector
    get() {
        if (_skateboarding != null) {
            return _skateboarding!!
        }
        _skateboarding = Builder(
            name = "Skateboarding", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(21.0f, 4.0f)
                curveTo(21.0f, 5.1046f, 20.1046f, 6.0f, 19.0f, 6.0f)
                curveTo(17.8954f, 6.0f, 17.0f, 5.1046f, 17.0f, 4.0f)
                curveTo(17.0f, 2.8954f, 17.8954f, 2.0f, 19.0f, 2.0f)
                curveTo(20.1046f, 2.0f, 21.0f, 2.8954f, 21.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.3322f, 5.3454f)
                curveTo(12.0231f, 4.9137f, 12.8815f, 4.8475f, 13.6303f, 5.1684f)
                curveTo(15.3575f, 5.9087f, 15.6717f, 8.2231f, 14.2044f, 9.397f)
                lineTo(13.7588f, 9.7534f)
                curveTo(13.6749f, 9.8205f, 13.6503f, 9.8404f, 13.6353f, 9.8534f)
                curveTo(13.0133f, 10.3907f, 13.0703f, 11.3718f, 13.7504f, 11.8335f)
                curveTo(13.7666f, 11.8445f, 13.7989f, 11.8649f, 13.9032f, 11.9301f)
                lineTo(13.9126f, 11.936f)
                curveTo(13.9819f, 11.9793f, 14.0291f, 12.0087f, 14.0704f, 12.0361f)
                curveTo(15.0902f, 12.7114f, 15.7166f, 13.8415f, 15.7487f, 15.0642f)
                curveTo(15.75f, 15.1136f, 15.75f, 15.1649f, 15.75f, 15.2393f)
                verticalLineTo(16.5f)
                curveTo(15.75f, 16.9142f, 15.4142f, 17.25f, 15.0f, 17.25f)
                curveTo(14.5858f, 17.25f, 14.25f, 16.9142f, 14.25f, 16.5f)
                verticalLineTo(15.2491f)
                curveTo(14.25f, 15.1612f, 14.2499f, 15.1308f, 14.2492f, 15.1036f)
                curveTo(14.2299f, 14.37f, 13.8541f, 13.6919f, 13.2423f, 13.2868f)
                lineTo(13.1486f, 13.2273f)
                curveTo(13.1368f, 13.2199f, 13.1234f, 13.2116f, 13.1082f, 13.2021f)
                lineTo(13.0915f, 13.1916f)
                curveTo(13.0109f, 13.1412f, 12.9512f, 13.1039f, 12.9079f, 13.0745f)
                curveTo(11.4118f, 12.0589f, 11.2863f, 9.9005f, 12.6547f, 8.7183f)
                curveTo(12.6943f, 8.6841f, 12.7437f, 8.6445f, 12.8091f, 8.5922f)
                lineTo(13.2673f, 8.2257f)
                curveTo(13.8498f, 7.7597f, 13.7251f, 6.841f, 13.0395f, 6.5472f)
                curveTo(12.7422f, 6.4198f, 12.4015f, 6.446f, 12.1272f, 6.6174f)
                lineTo(8.8975f, 8.636f)
                curveTo(8.5463f, 8.8555f, 8.0835f, 8.7487f, 7.864f, 8.3975f)
                curveTo(7.6445f, 8.0463f, 7.7513f, 7.5835f, 8.1025f, 7.364f)
                lineTo(11.3322f, 5.3454f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.4983f, 16.4425f)
                curveTo(2.8062f, 16.1654f, 3.2804f, 16.1904f, 3.5575f, 16.4983f)
                lineTo(4.7616f, 17.8362f)
                curveTo(4.9987f, 18.0996f, 5.3364f, 18.25f, 5.6907f, 18.25f)
                horizontalLineTo(18.3093f)
                curveTo(18.6636f, 18.25f, 19.0013f, 18.0996f, 19.2384f, 17.8362f)
                lineTo(20.4425f, 16.4983f)
                curveTo(20.7196f, 16.1904f, 21.1938f, 16.1654f, 21.5017f, 16.4425f)
                curveTo(21.8096f, 16.7196f, 21.8346f, 17.1938f, 21.5575f, 17.5017f)
                lineTo(20.3533f, 18.8397f)
                curveTo(19.8318f, 19.4191f, 19.0889f, 19.75f, 18.3093f, 19.75f)
                horizontalLineTo(5.6907f)
                curveTo(4.9111f, 19.75f, 4.1682f, 19.4191f, 3.6467f, 18.8397f)
                lineTo(2.4425f, 17.5017f)
                curveTo(2.1654f, 17.1938f, 2.1904f, 16.7196f, 2.4983f, 16.4425f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.0f, 21.0002f)
                curveTo(8.0f, 21.5525f, 7.5523f, 22.0002f, 7.0f, 22.0002f)
                curveTo(6.4477f, 22.0002f, 6.0f, 21.5525f, 6.0f, 21.0002f)
                curveTo(6.0f, 20.4479f, 6.4477f, 20.0002f, 7.0f, 20.0002f)
                curveTo(7.5523f, 20.0002f, 8.0f, 20.4479f, 8.0f, 21.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 21.0002f)
                curveTo(18.0f, 21.5525f, 17.5523f, 22.0002f, 17.0f, 22.0002f)
                curveTo(16.4477f, 22.0002f, 16.0f, 21.5525f, 16.0f, 21.0002f)
                curveTo(16.0f, 20.4479f, 16.4477f, 20.0002f, 17.0f, 20.0002f)
                curveTo(17.5523f, 20.0002f, 18.0f, 20.4479f, 18.0f, 21.0002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(15.7724f, 9.8183f)
                curveTo(15.8729f, 9.4164f, 16.2801f, 9.1721f, 16.6819f, 9.2726f)
                curveTo(17.8756f, 9.571f, 19.1244f, 9.571f, 20.3181f, 9.2726f)
                curveTo(20.7199f, 9.1721f, 21.1272f, 9.4164f, 21.2276f, 9.8183f)
                curveTo(21.3281f, 10.2201f, 21.0838f, 10.6273f, 20.6819f, 10.7278f)
                curveTo(19.2494f, 11.0859f, 17.7507f, 11.0859f, 16.3181f, 10.7278f)
                curveTo(15.9163f, 10.6273f, 15.6719f, 10.2201f, 15.7724f, 9.8183f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.5303f, 13.4698f)
                curveTo(11.8232f, 13.7627f, 11.8232f, 14.2376f, 11.5303f, 14.5305f)
                curveTo(10.4293f, 15.6316f, 8.9359f, 16.2502f, 7.3787f, 16.2502f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.2502f, 6.25f, 15.9144f, 6.25f, 15.5002f)
                curveTo(6.25f, 15.086f, 6.5858f, 14.7502f, 7.0f, 14.7502f)
                horizontalLineTo(7.3787f)
                curveTo(8.538f, 14.7502f, 9.6499f, 14.2896f, 10.4697f, 13.4698f)
                curveTo(10.7626f, 13.177f, 11.2374f, 13.177f, 11.5303f, 13.4698f)
                close()
            }
        }
            .build()
        return _skateboarding!!
    }

private var _skateboarding: ImageVector? = null
